package com.inmobi.media;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.j9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3063j9 extends kotlin.coroutines.jvm.internal.m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3167n9 f26796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f26797b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3063j9(C3167n9 c3167n9, String str, kl.f fVar) {
        super(1, fVar);
        this.f26796a = c3167n9;
        this.f26797b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(kl.f fVar) {
        return new C3063j9(this.f26796a, this.f26797b, fVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C3063j9(this.f26796a, this.f26797b, (kl.f) obj).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        SQLiteDatabase sQLiteDatabase = this.f26796a.f27045d;
        if (sQLiteDatabase == null) {
            return gl.r.l();
        }
        ArrayList arrayList = new ArrayList();
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery(this.f26797b, null);
            try {
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        ContentValues contentValues = new ContentValues();
                        DatabaseUtils.cursorRowToContentValues(cursorRawQuery, contentValues);
                        arrayList.add(contentValues);
                    } while (cursorRawQuery.moveToNext());
                }
                fl.g0 g0Var = fl.g0.f38750a;
                ql.b.a(cursorRawQuery, null);
                return arrayList;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ql.b.a(cursorRawQuery, th2);
                    throw th3;
                }
            }
        } catch (Exception unused) {
            return arrayList;
        }
    }
}
