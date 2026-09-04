package com.inmobi.media;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: renamed from: com.inmobi.media.k9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3089k9 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f26850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ContentValues f26851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f26852d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3089k9(String str, ContentValues contentValues, int i10, kl.f fVar) {
        super(2, fVar);
        this.f26850b = str;
        this.f26851c = contentValues;
        this.f26852d = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        C3089k9 c3089k9 = new C3089k9(this.f26850b, this.f26851c, this.f26852d, fVar);
        c3089k9.f26849a = obj;
        return c3089k9;
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((C3089k9) create((C3167n9) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        SQLiteDatabase sQLiteDatabase = ((C3167n9) this.f26849a).f27044c;
        if (sQLiteDatabase != null) {
            kotlin.coroutines.jvm.internal.b.e(sQLiteDatabase.insertWithOnConflict(this.f26850b, null, this.f26851c, this.f26852d));
        }
        return fl.g0.f38750a;
    }
}
