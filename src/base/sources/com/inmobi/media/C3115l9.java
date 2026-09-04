package com.inmobi.media;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: renamed from: com.inmobi.media.l9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3115l9 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f26932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ContentValues f26933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f26934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String[] f26935e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3115l9(String str, ContentValues contentValues, String str2, String[] strArr, kl.f fVar) {
        super(2, fVar);
        this.f26932b = str;
        this.f26933c = contentValues;
        this.f26934d = str2;
        this.f26935e = strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        C3115l9 c3115l9 = new C3115l9(this.f26932b, this.f26933c, this.f26934d, this.f26935e, fVar);
        c3115l9.f26931a = obj;
        return c3115l9;
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((C3115l9) create((C3167n9) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        SQLiteDatabase sQLiteDatabase = ((C3167n9) this.f26931a).f27044c;
        if (sQLiteDatabase != null) {
            kotlin.coroutines.jvm.internal.b.d(sQLiteDatabase.updateWithOnConflict(this.f26932b, this.f26933c, this.f26934d, this.f26935e, 4));
        }
        return fl.g0.f38750a;
    }
}
