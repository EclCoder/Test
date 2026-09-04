package com.mbridge.msdk.setting;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f32491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap<String, f> f32492b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final e f32493a = new e();
    }

    public static e a() {
        return b.f32493a;
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (this.f32492b == null) {
                this.f32492b = new HashMap<>();
            }
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String string = jSONObject.getString(next);
                f fVar = new f();
                fVar.a(next);
                fVar.b(string);
                this.f32492b.put(next, fVar);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private e() {
        this.f32491a = 6;
        this.f32492b = new HashMap<>();
    }

    public int a(String str) {
        HashMap<String, f> map;
        f fVar;
        int i10;
        if (TextUtils.isEmpty(str) || (map = this.f32492b) == null || !map.containsKey(str) || (fVar = this.f32492b.get(str)) == null) {
            return 0;
        }
        if (fVar.b()) {
            i10 = 1;
        } else {
            i10 = fVar.a() >= this.f32491a ? 2 : 0;
        }
        fVar.a(false);
        return i10;
    }
}
