package com.bytedance.sdk.openadsdk.as;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final Context f13258hn;
    private SharedPreferences hnj;
    private final String qor;

    public qor(Context context, String str) {
        this.f13258hn = context;
        this.qor = str;
    }

    private SharedPreferences hn() {
        Context context;
        SharedPreferences sharedPreferences = this.hnj;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        if (TextUtils.isEmpty(this.qor) || (context = this.f13258hn) == null) {
            return null;
        }
        try {
            this.hnj = context.getSharedPreferences(this.qor, 0);
        } catch (Throwable th2) {
            Log.e("SPUnit", th2.getMessage());
        }
        return this.hnj;
    }

    public void hnj(JSONObject jSONObject) {
        try {
            SharedPreferences sharedPreferencesHn = hn();
            if (sharedPreferencesHn != null) {
                SharedPreferences.Editor editorEdit = sharedPreferencesHn.edit();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        if (!TextUtils.isEmpty(next)) {
                            Object obj = jSONObject.get(next);
                            if (obj instanceof Integer) {
                                editorEdit.putInt(next, ((Integer) obj).intValue());
                            } else if (obj instanceof Long) {
                                editorEdit.putLong(next, ((Long) obj).longValue());
                            } else if (obj instanceof String) {
                                editorEdit.putString(next, (String) obj);
                            } else if (obj instanceof Boolean) {
                                editorEdit.putBoolean(next, ((Boolean) obj).booleanValue());
                            } else if (obj instanceof Float) {
                                editorEdit.putFloat(next, ((Float) obj).floatValue());
                            } else if (obj instanceof Double) {
                                editorEdit.putFloat(next, ((Double) obj).floatValue());
                            } else {
                                editorEdit.putString(next, String.valueOf(obj));
                            }
                        }
                    } catch (Throwable th2) {
                        Log.e("SPUnit", th2.getMessage());
                    }
                }
                editorEdit.apply();
            }
        } catch (Throwable th3) {
            Log.e("SPUnit", th3.getMessage());
        }
    }

    public long hn(String str, long j10) {
        try {
            SharedPreferences sharedPreferencesHn = hn();
            if (sharedPreferencesHn != null && sharedPreferencesHn.contains(str)) {
                return sharedPreferencesHn.getLong(str, j10);
            }
            return j10;
        } catch (Throwable th2) {
            Log.i("SPUnit", this.qor + th2.getMessage());
            return j10;
        }
    }

    public void hnj(String str, long j10) {
        try {
            SharedPreferences sharedPreferencesHn = hn();
            if (sharedPreferencesHn != null) {
                SharedPreferences.Editor editorEdit = sharedPreferencesHn.edit();
                editorEdit.putLong(str, j10);
                editorEdit.apply();
            }
        } catch (Throwable th2) {
            Log.e("SPUnit", th2.getMessage());
        }
    }

    public int hnj(String str, int i10) {
        try {
            SharedPreferences sharedPreferencesHn = hn();
            if (sharedPreferencesHn != null && sharedPreferencesHn.contains(str)) {
                return sharedPreferencesHn.getInt(str, i10);
            }
            return i10;
        } catch (Throwable th2) {
            Log.i("SPUnit", this.qor + th2.getMessage());
            return i10;
        }
    }

    public String hnj(String str, String str2) {
        try {
            SharedPreferences sharedPreferencesHn = hn();
            if (sharedPreferencesHn != null && sharedPreferencesHn.contains(str)) {
                return sharedPreferencesHn.getString(str, str2);
            }
            return str2;
        } catch (Throwable th2) {
            Log.i("SPUnit", this.qor + th2.getMessage());
            return str2;
        }
    }

    public boolean hnj(String str, boolean z10) {
        try {
            SharedPreferences sharedPreferencesHn = hn();
            if (sharedPreferencesHn != null && sharedPreferencesHn.contains(str)) {
                return sharedPreferencesHn.getBoolean(str, z10);
            }
            return z10;
        } catch (Throwable th2) {
            Log.i("SPUnit", this.qor + th2.getMessage());
            return z10;
        }
    }

    public <T> T hnj(String str, T t10, hn.hnj<T> hnjVar) {
        String string;
        T tHn;
        if (str != null && !str.isEmpty()) {
            try {
                SharedPreferences sharedPreferencesHn = hn();
                if (sharedPreferencesHn != null && sharedPreferencesHn.contains(str) && (string = sharedPreferencesHn.getString(str, null)) != null && hnjVar != null && (tHn = hnjVar.hn(string)) != null) {
                    return tHn;
                }
            } catch (Throwable th2) {
                Log.i("SPUnit", this.qor + th2.getMessage());
            }
        }
        return t10;
    }

    public void hnj() {
        SharedPreferences sharedPreferencesHn = hn();
        if (sharedPreferencesHn != null) {
            SharedPreferences.Editor editorEdit = sharedPreferencesHn.edit();
            editorEdit.clear();
            editorEdit.commit();
        }
    }
}
