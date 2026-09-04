package com.inmobi.media;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: renamed from: com.inmobi.media.f9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2960f9 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f26544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f26545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String[] f26546d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2960f9(String str, String str2, String[] strArr, kl.f fVar) {
        super(2, fVar);
        this.f26544b = str;
        this.f26545c = str2;
        this.f26546d = strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        C2960f9 c2960f9 = new C2960f9(this.f26544b, this.f26545c, this.f26546d, fVar);
        c2960f9.f26543a = obj;
        return c2960f9;
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((C2960f9) create((C3167n9) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        SQLiteDatabase sQLiteDatabase = ((C3167n9) this.f26543a).f27044c;
        if (sQLiteDatabase != null) {
            kotlin.coroutines.jvm.internal.b.d(sQLiteDatabase.delete(this.f26544b, this.f26545c, this.f26546d));
        }
        return fl.g0.f38750a;
    }
}
