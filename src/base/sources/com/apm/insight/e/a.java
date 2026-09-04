package com.apm.insight.e;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.apm.insight.e;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile a f10653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.apm.insight.e.a.b f10654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SQLiteDatabase f10655c;

    private a() {
    }

    public static a a() {
        if (f10653a == null) {
            synchronized (a.class) {
                try {
                    if (f10653a == null) {
                        f10653a = new a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f10653a;
    }

    private void b() {
        if (this.f10654b == null) {
            a(e.g());
        }
    }

    public final synchronized void a(Context context) {
        try {
            this.f10655c = new b(context).getWritableDatabase();
        } catch (Throwable th2) {
            com.apm.insight.a.b(th2);
        }
        this.f10654b = new com.apm.insight.e.a.b();
    }

    public final synchronized void a(com.apm.insight.d.a aVar) {
        b();
        com.apm.insight.e.a.b bVar = this.f10654b;
        if (bVar != null) {
            bVar.a(this.f10655c, aVar);
        }
    }

    public final synchronized boolean a(String str) {
        b();
        com.apm.insight.e.a.b bVar = this.f10654b;
        if (bVar == null) {
            return false;
        }
        return bVar.a(this.f10655c, str);
    }
}
