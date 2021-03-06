package com.example.placementapp.helper;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.placementapp.constants.Constants;

public abstract class SharedPrefHelper {
    public static SharedPreferences sharedPreferences;

    public static void saveEntryinSharedPreferences(Context context, String key, String value)
    {
        sharedPreferences = context.getSharedPreferences(Constants.SharedPrefConstants.SHARED_PREF,context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key,value);
        editor.apply();
    }

    public static String getEntryfromSharedPreferences(Context context, String key)
    {
        sharedPreferences = context.getSharedPreferences(Constants.SharedPrefConstants.SHARED_PREF,context.MODE_PRIVATE);
        return sharedPreferences.getString(key,null);
    }

    public static boolean clearEntriesInSharedPrefs(Context context) {
        if (context == null) {
            return false;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.SharedPrefConstants.SHARED_PREF, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.commit();
        return true;
    }
}
