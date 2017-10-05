package com.example.donnald.myalertdialog2;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Donnald on 10/5/2017.
 */

public class CustomDialog extends DialogFragment{
    LayoutInflater inflater;
    View v;
    EditText etUser,etPass;
    
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        inflater = getActivity().getLayoutInflater();
        v = inflater.inflate(R.layout.login_dialog, null);

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setView(v);
        builder.setPositiveButton("Login", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                etUser = (EditText) v.findViewById(R.id.et_username);
                etPass = (EditText) v.findViewById(R.id.et_password);

                String user = etUser.getText().toString();
                String password = etPass.getText().toString();
                String msg = "Username is " + user + ". Password is " + password + ".";
                Toast.makeText(getActivity(),msg,Toast.LENGTH_LONG).show();

            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        builder.setTitle("Login");
        Dialog dialog = builder.create();
        return dialog;
    }

}
