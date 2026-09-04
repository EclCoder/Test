package com.inmobi.media;

import com.bytedance.adsdk.ugeno.ojm.hnj.mzIi.obFGmWgqyy;
import com.inmobi.media.AbstractC3009h6;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.h6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3009h6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3167n9 f26655b;

    public AbstractC3009h6(String tableName, C3167n9 databaseHelper) {
        kotlin.jvm.internal.s.h(tableName, "tableName");
        kotlin.jvm.internal.s.h(databaseHelper, "databaseHelper");
        this.f26654a = tableName;
        this.f26655b = databaseHelper;
    }

    public final Object a(kotlin.coroutines.jvm.internal.d dVar) {
        String str = "SELECT COUNT(*) FROM " + this.f26654a;
        C3167n9 c3167n9 = this.f26655b;
        c3167n9.getClass();
        return c3167n9.a(new C2934e9(c3167n9, str, null), dVar);
    }

    public abstract Object b(int i10, kotlin.coroutines.jvm.internal.d dVar);

    public final Object a(ArrayList arrayList, kotlin.coroutines.jvm.internal.m mVar) {
        if (arrayList.isEmpty()) {
            return fl.g0.f38750a;
        }
        String strL0 = gl.r.l0(arrayList, ",", null, null, 0, null, new Function1() { // from class: yh.u8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC3009h6.a(((Integer) obj).intValue());
            }
        }, 30, null);
        Object objA = C3167n9.a(this.f26655b, this.f26654a, "id IN (" + strL0 + ")", mVar, 4);
        return objA == ll.b.f() ? objA : fl.g0.f38750a;
    }

    public static final CharSequence a(int i10) {
        return String.valueOf(i10);
    }

    public final Object a(long j10, kotlin.coroutines.jvm.internal.d dVar) {
        Object objA = C3167n9.a(this.f26655b, this.f26654a, "ts < " + j10, dVar, 4);
        return objA == ll.b.f() ? objA : fl.g0.f38750a;
    }

    public final Object a(int i10, kotlin.coroutines.jvm.internal.d dVar) {
        String str = this.f26654a;
        Object objA = this.f26655b.a("DELETE FROM " + str + " WHERE id IN (SELECT id FROM " + str + " ORDER BY ts ASC LIMIT " + i10 + obFGmWgqyy.bjAcmmRhEXSDMo, dVar);
        return objA == ll.b.f() ? objA : fl.g0.f38750a;
    }
}
