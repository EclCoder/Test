package com.inmobi.media;

import android.content.Context;
import com.google.android.gms.measurement.AppMeasurement;
import com.inmobi.media.AbstractC3193o9;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.inmobi.media.o9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3193o9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fl.k f27128a = fl.l.b(new tl.a() { // from class: yh.aa
        @Override // tl.a
        public final Object invoke() {
            return AbstractC3193o9.a();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final fl.k f27129b = fl.l.b(new tl.a() { // from class: yh.ba
        @Override // tl.a
        public final Object invoke() {
            return AbstractC3193o9.c();
        }
    });

    public static final C2909d9 a() {
        Context context = Xi.f26021a;
        kotlin.jvm.internal.s.h("com.im_11.2.0.db", "name");
        ArrayList arrayList = new ArrayList();
        kotlin.jvm.internal.s.h("ad_quality_db", "tableName");
        kotlin.jvm.internal.s.h("(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, image_location TEXT NOT NULL, sdk_model_result TEXT, beacon_url TEXT NOT NULL, extras TEXT)", "tableSchema");
        arrayList.add(new C2945ek("ad_quality_db", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, image_location TEXT NOT NULL, sdk_model_result TEXT, beacon_url TEXT NOT NULL, extras TEXT)"));
        kotlin.jvm.internal.s.h(CampaignEx.JSON_NATIVE_VIDEO_CLICK, "tableName");
        kotlin.jvm.internal.s.h("(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, pending_attempts INTEGER NOT NULL, url TEXT NOT NULL, ping_in_webview TEXT NOT NULL, follow_redirect TEXT NOT NULL, ts TEXT NOT NULL, track_extras TEXT, created_ts TEXT NOT NULL )", "tableSchema");
        arrayList.add(new C2945ek(CampaignEx.JSON_NATIVE_VIDEO_CLICK, "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, pending_attempts INTEGER NOT NULL, url TEXT NOT NULL, ping_in_webview TEXT NOT NULL, follow_redirect TEXT NOT NULL, ts TEXT NOT NULL, track_extras TEXT, created_ts TEXT NOT NULL )"));
        kotlin.jvm.internal.s.h("config_db", "tableName");
        kotlin.jvm.internal.s.h("(config_value TEXT NOT NULL,config_type TEXT NOT NULL,update_ts INTEGER DEFAULT 0,UNIQUE(config_type))", "tableSchema");
        arrayList.add(new C2945ek("config_db", "(config_value TEXT NOT NULL,config_type TEXT NOT NULL,update_ts INTEGER DEFAULT 0,UNIQUE(config_type))"));
        kotlin.jvm.internal.s.h("c_data", "tableName");
        kotlin.jvm.internal.s.h("(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, e_data TEXT NOT NULL, timestamp INTEGER NOT NULL )", "tableSchema");
        arrayList.add(new C2945ek("c_data", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, e_data TEXT NOT NULL, timestamp INTEGER NOT NULL )"));
        kotlin.jvm.internal.s.h(AppMeasurement.CRASH_ORIGIN, "tableName");
        kotlin.jvm.internal.s.h("(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, componentType TEXT NOT NULL, eventId TEXT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, ts TEXT NOT NULL)", "tableSchema");
        arrayList.add(new C2945ek(AppMeasurement.CRASH_ORIGIN, "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, componentType TEXT NOT NULL, eventId TEXT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, ts TEXT NOT NULL)"));
        kotlin.jvm.internal.s.h("logs_v2", "tableName");
        kotlin.jvm.internal.s.h("(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, filename TEXT NOT NULL, saveTimestamp INTEGER NOT NULL, retryCount INTEGER NOT NULL, hasLoggerFinished INTEGER NOT NULL, checkpoints INTEGER NOT NULL,lastRetryTimestamp INTEGER NOT NULL )", "tableSchema");
        arrayList.add(new C2945ek("logs_v2", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, filename TEXT NOT NULL, saveTimestamp INTEGER NOT NULL, retryCount INTEGER NOT NULL, hasLoggerFinished INTEGER NOT NULL, checkpoints INTEGER NOT NULL,lastRetryTimestamp INTEGER NOT NULL )"));
        kotlin.jvm.internal.s.h("pings", "tableName");
        kotlin.jvm.internal.s.h("(id TEXT PRIMARY KEY,url TEXT NOT NULL,headers TEXT,allow_redirects TEXT NOT NULL,priority TEXT NOT NULL,ack_required TEXT NOT NULL,time_created INTEGER NOT NULL,owner TEXT NOT NULL,retry_count INTEGER DEFAULT 0,retryAfter INTEGER DEFAULT 0,telemetry_metadata TEXT)", "tableSchema");
        arrayList.add(new C2945ek("pings", "(id TEXT PRIMARY KEY,url TEXT NOT NULL,headers TEXT,allow_redirects TEXT NOT NULL,priority TEXT NOT NULL,ack_required TEXT NOT NULL,time_created INTEGER NOT NULL,owner TEXT NOT NULL,retry_count INTEGER DEFAULT 0,retryAfter INTEGER DEFAULT 0,telemetry_metadata TEXT)"));
        kotlin.jvm.internal.s.h("telemetry", "tableName");
        kotlin.jvm.internal.s.h("(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, eventSource TEXT NOT NULL, ts TEXT NOT NULL)", "tableSchema");
        arrayList.add(new C2945ek("telemetry", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, eventSource TEXT NOT NULL, ts TEXT NOT NULL)"));
        Object value = f27129b.getValue();
        kotlin.jvm.internal.s.g(value, "getValue(...)");
        ExecutorService transactionExecutor = (ExecutorService) value;
        kotlin.jvm.internal.s.h(transactionExecutor, "transactionExecutor");
        C3189o5 c3189o5 = new C3189o5(context, arrayList, Ha.a(), transactionExecutor);
        C2909d9 c2909d9 = new C2909d9(c3189o5);
        E9 e10 = new E9(c3189o5);
        C3167n9 c3167n9 = new C3167n9(e10, c3189o5);
        c2909d9.f26399a = c3167n9;
        try {
            c3167n9.f27044c = e10.getWritableDatabase();
        } catch (Exception unused) {
        }
        try {
            c3167n9.f27045d = c3167n9.f27042a.getReadableDatabase();
        } catch (Exception unused2) {
        }
        ExecutorService executorService = c3167n9.f27043b.f27119d;
        if (executorService != null) {
            c3167n9.f27046e = em.r1.a(executorService);
        }
        return c2909d9;
    }

    public static final C3167n9 b() {
        C3167n9 c3167n9 = ((C2909d9) f27128a.getValue()).f26399a;
        if (c3167n9 != null) {
            return c3167n9;
        }
        kotlin.jvm.internal.s.w("_inmobiDatabaseHelper");
        return null;
    }

    public static final ExecutorService c() {
        kotlin.jvm.internal.s.h("db.transactionExecutor", "name");
        return Executors.newSingleThreadExecutor(new I9("db.transactionExecutor", false));
    }
}
