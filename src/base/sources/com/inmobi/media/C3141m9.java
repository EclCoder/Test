package com.inmobi.media;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.m9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3141m9 extends kotlin.coroutines.jvm.internal.m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SQLiteDatabase f26986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3167n9 f26988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.jvm.internal.m f26989d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3141m9(C3167n9 c3167n9, tl.o oVar, kl.f fVar) {
        super(1, fVar);
        this.f26988c = c3167n9;
        this.f26989d = (kotlin.coroutines.jvm.internal.m) oVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.m, tl.o] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(kl.f fVar) {
        return new C3141m9(this.f26988c, this.f26989d, fVar);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.m, tl.o] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C3141m9(this.f26988c, this.f26989d, (kl.f) obj).invokeSuspend(fl.g0.f38750a);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0063 A[Catch: SQLiteException -> 0x0067, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x0067, blocks: (B:37:0x005d, B:39:0x0063), top: B:55:0x005d }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.jvm.internal.m, tl.o] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        Object objF = ll.b.f();
        int i10 = this.f26987b;
        try {
            if (i10 == 0) {
                fl.s.b(obj);
                C3167n9 c3167n9 = this.f26988c;
                sQLiteDatabase = c3167n9.f27044c;
                if (sQLiteDatabase == 0) {
                    return null;
                }
                ?? r10 = this.f26989d;
                if (c3167n9.f27043b.f27118c == 2) {
                    sQLiteDatabase.beginTransactionNonExclusive();
                } else {
                    sQLiteDatabase.beginTransaction();
                }
                try {
                    this.f26986a = sQLiteDatabase;
                    this.f26987b = 1;
                    if (r10.invoke(c3167n9, this) == objF) {
                        return objF;
                    }
                    sQLiteDatabase2 = sQLiteDatabase;
                } catch (SQLiteException e10) {
                    e = e10;
                    sQLiteDatabase2 = sQLiteDatabase;
                    e.getMessage();
                    if (sQLiteDatabase2.inTransaction()) {
                        sQLiteDatabase2.endTransaction();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (SQLiteException e11) {
                        e11.getMessage();
                    }
                    throw th;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sQLiteDatabase2 = this.f26986a;
                try {
                    fl.s.b(obj);
                    sQLiteDatabase2 = sQLiteDatabase2;
                } catch (SQLiteException e12) {
                    e = e12;
                    e.getMessage();
                    try {
                        if (sQLiteDatabase2.inTransaction()) {
                            sQLiteDatabase2.endTransaction();
                        }
                    } catch (SQLiteException e13) {
                        e13.getMessage();
                    }
                }
            }
            sQLiteDatabase2.setTransactionSuccessful();
            try {
                if (sQLiteDatabase2.inTransaction()) {
                    sQLiteDatabase2.endTransaction();
                }
            } catch (SQLiteException e14) {
                e14.getMessage();
            }
            return fl.g0.f38750a;
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase = objF;
        }
    }
}
