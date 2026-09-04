package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f22403c = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f22404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22405b;

    private u(Context context, String str) {
        this.f22404a = context;
        this.f22405b = str;
    }

    public static synchronized u c(Context context, String str) {
        Map map;
        try {
            map = f22403c;
            if (!map.containsKey(str)) {
                map.put(str, new u(context, str));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (u) map.get(str);
    }

    public synchronized Void a() {
        this.f22404a.deleteFile(this.f22405b);
        return null;
    }

    String b() {
        return this.f22405b;
    }

    public synchronized g d() {
        FileInputStream fileInputStreamOpenFileInput;
        Throwable th2;
        try {
            try {
                fileInputStreamOpenFileInput = this.f22404a.openFileInput(this.f22405b);
                try {
                    int iAvailable = fileInputStreamOpenFileInput.available();
                    byte[] bArr = new byte[iAvailable];
                    fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                    g gVarB = g.b(new JSONObject(new String(bArr, C.UTF8_NAME)));
                    fileInputStreamOpenFileInput.close();
                    return gVarB;
                } catch (FileNotFoundException | JSONException unused) {
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                    return null;
                } catch (Throwable th3) {
                    th2 = th3;
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        } catch (FileNotFoundException | JSONException unused2) {
            fileInputStreamOpenFileInput = null;
        } catch (Throwable th5) {
            fileInputStreamOpenFileInput = null;
            th2 = th5;
        }
    }

    public synchronized Void e(g gVar) {
        FileOutputStream fileOutputStreamOpenFileOutput = this.f22404a.openFileOutput(this.f22405b, 0);
        try {
            fileOutputStreamOpenFileOutput.write(gVar.toString().getBytes(C.UTF8_NAME));
            fileOutputStreamOpenFileOutput.close();
        } catch (Throwable th2) {
            fileOutputStreamOpenFileOutput.close();
            throw th2;
        }
        return null;
    }
}
