package com.inmobi.media;

import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.e9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2934e9 extends kotlin.coroutines.jvm.internal.m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3167n9 f26476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f26477b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2934e9(C3167n9 c3167n9, String str, kl.f fVar) {
        super(1, fVar);
        this.f26476a = c3167n9;
        this.f26477b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(kl.f fVar) {
        return new C2934e9(this.f26476a, this.f26477b, fVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C2934e9(this.f26476a, this.f26477b, (kl.f) obj).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        SQLiteDatabase sQLiteDatabase = this.f26476a.f27045d;
        int iLongForQuery = 0;
        if (sQLiteDatabase == null) {
            return kotlin.coroutines.jvm.internal.b.d(0);
        }
        try {
            iLongForQuery = (int) DatabaseUtils.longForQuery(sQLiteDatabase, this.f26477b, null);
        } catch (SQLiteException e10) {
            e10.getMessage();
        }
        return kotlin.coroutines.jvm.internal.b.d(iLongForQuery);
    }
}
