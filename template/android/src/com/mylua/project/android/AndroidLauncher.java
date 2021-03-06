package com.mylua.project.android;

import android.app.Activity;
import android.os.Bundle;
import io.nondev.nonlua.Lua;
import io.nondev.nonfilesystem.AndroidFiles;
import com.mylua.project.MyLuaProject;

public class AndroidLauncher extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new MyLuaProject(new AndroidFiles(getAssets()));
    }
}
