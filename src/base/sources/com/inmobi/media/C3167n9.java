package com.inmobi.media;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: renamed from: com.inmobi.media.n9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3167n9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E9 f27042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3189o5 f27043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SQLiteDatabase f27044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SQLiteDatabase f27045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public em.k0 f27046e;

    public C3167n9(E9 sqLiteOpenHelper, C3189o5 databaseConfig) {
        kotlin.jvm.internal.s.h(sqLiteOpenHelper, "sqLiteOpenHelper");
        kotlin.jvm.internal.s.h(databaseConfig, "databaseConfig");
        this.f27042a = sqLiteOpenHelper;
        this.f27043b = databaseConfig;
    }

    public final Object a(String str, ContentValues contentValues, int i10, kotlin.coroutines.jvm.internal.d dVar) {
        Object objA = a(new C3141m9(this, new C3089k9(str, contentValues, i10, null), null), dVar);
        return objA == ll.b.f() ? objA : fl.g0.f38750a;
    }

    public static Object a(C3167n9 c3167n9, String str, ContentValues contentValues, String str2, String[] strArr, kotlin.coroutines.jvm.internal.d dVar, int i10) {
        String str3 = (i10 & 4) != 0 ? null : str2;
        String[] strArr2 = (i10 & 8) != 0 ? null : strArr;
        c3167n9.getClass();
        Object objA = c3167n9.a(new C3141m9(c3167n9, new C3115l9(str, contentValues, str3, strArr2, null), null), dVar);
        return objA == ll.b.f() ? objA : fl.g0.f38750a;
    }

    public static /* synthetic */ Object a(C3167n9 c3167n9, String str, String str2, kotlin.coroutines.jvm.internal.d dVar, int i10) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return c3167n9.a(str, str2, (String[]) null, dVar);
    }

    public final Object a(String str, String str2, String[] strArr, kl.f fVar) {
        Object objA = a(new C3141m9(this, new C2960f9(str, str2, strArr, null), null), fVar);
        return objA == ll.b.f() ? objA : fl.g0.f38750a;
    }

    public final Object a(String str, kotlin.coroutines.jvm.internal.d dVar) {
        Object objA = a(new C3141m9(this, new C2986g9(str, null), null), dVar);
        return objA == ll.b.f() ? objA : fl.g0.f38750a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0061 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (r8 == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.jvm.functions.Function1 r7, kl.f r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.inmobi.media.C3012h9
            if (r0 == 0) goto L13
            r0 = r8
            com.inmobi.media.h9 r0 = (com.inmobi.media.C3012h9) r0
            int r1 = r0.f26663d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26663d = r1
            goto L18
        L13:
            com.inmobi.media.h9 r0 = new com.inmobi.media.h9
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f26661b
            java.lang.Object r1 = ll.b.f()
            int r2 = r0.f26663d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            fl.s.b(r8)
            return r8
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.jvm.functions.Function1 r7 = r0.f26660a
            fl.s.b(r8)
            goto L52
        L3b:
            fl.s.b(r8)
            em.k0 r8 = r6.f27046e
            if (r8 == 0) goto L56
            com.inmobi.media.i9 r2 = new com.inmobi.media.i9
            r2.<init>(r7, r3)
            r0.f26660a = r7
            r0.f26663d = r5
            java.lang.Object r8 = em.i.j(r8, r2, r0)
            if (r8 != r1) goto L52
            goto L60
        L52:
            if (r8 != 0) goto L55
            goto L56
        L55:
            return r8
        L56:
            r0.f26660a = r3
            r0.f26663d = r4
            java.lang.Object r7 = r7.invoke(r0)
            if (r7 != r1) goto L61
        L60:
            return r1
        L61:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3167n9.a(kotlin.jvm.functions.Function1, kl.f):java.lang.Object");
    }
}
