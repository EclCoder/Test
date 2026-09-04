package com.inmobi.media;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.inmobi.media.xg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3433xg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3167n9 f27857a;

    public C3433xg(C3167n9 databaseHelper) {
        kotlin.jvm.internal.s.h(databaseHelper, "databaseHelper");
        this.f27857a = databaseHelper;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Integer num, String str, long j10, kotlin.coroutines.jvm.internal.d dVar) {
        C3407wg c3407wg;
        String str2;
        if (dVar instanceof C3407wg) {
            c3407wg = (C3407wg) dVar;
            int i10 = c3407wg.f27798c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3407wg.f27798c = i10 - Integer.MIN_VALUE;
            } else {
                c3407wg = new C3407wg(this, dVar);
            }
        } else {
            c3407wg = new C3407wg(this, dVar);
        }
        Object objA = c3407wg.f27796a;
        Object objF = ll.b.f();
        int i11 = c3407wg.f27798c;
        if (i11 == 0) {
            fl.s.b(objA);
            if (num != null) {
                str2 = " LIMIT " + num.intValue();
                if (str2 == null) {
                    str2 = "";
                }
            } else {
                str2 = "";
            }
            String str3 = "SELECT * FROM pings WHERE priority='" + str + "' AND retry_count=0 AND time_created<" + j10 + " ORDER BY time_created ASC" + str2;
            C3167n9 c3167n9 = this.f27857a;
            c3407wg.f27798c = 1;
            c3167n9.getClass();
            objA = c3167n9.a(new C3063j9(c3167n9, str3, null), c3407wg);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(objA);
        }
        Iterable iterable = (Iterable) objA;
        ArrayList arrayList = new ArrayList(gl.r.v(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC3458yg.a((ContentValues) it.next()));
        }
        return arrayList;
    }

    public final Object b(String str, kotlin.coroutines.jvm.internal.d dVar) {
        String str2 = "SELECT COUNT(*) FROM pings WHERE priority='" + str + "'";
        C3167n9 c3167n9 = this.f27857a;
        c3167n9.getClass();
        return c3167n9.a(new C2934e9(c3167n9, str2, null), dVar);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0051  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, Integer num, kotlin.coroutines.jvm.internal.d dVar) {
        C3381vg c3381vg;
        String str2;
        if (dVar instanceof C3381vg) {
            c3381vg = (C3381vg) dVar;
            int i10 = c3381vg.f27726c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3381vg.f27726c = i10 - Integer.MIN_VALUE;
            } else {
                c3381vg = new C3381vg(this, dVar);
            }
        } else {
            c3381vg = new C3381vg(this, dVar);
        }
        Object objA = c3381vg.f27724a;
        Object objF = ll.b.f();
        int i11 = c3381vg.f27726c;
        if (i11 == 0) {
            fl.s.b(objA);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (num != null) {
                str2 = " LIMIT " + num.intValue();
                if (str2 == null) {
                    str2 = "";
                }
            } else {
                str2 = "";
            }
            String str3 = "SELECT * FROM pings WHERE priority='" + str + "' AND retry_count>=1 AND retryAfter<=" + jCurrentTimeMillis + " ORDER BY time_created ASC" + str2;
            C3167n9 c3167n9 = this.f27857a;
            c3381vg.f27726c = 1;
            c3167n9.getClass();
            objA = c3167n9.a(new C3063j9(c3167n9, str3, null), c3381vg);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(objA);
        }
        Iterable iterable = (Iterable) objA;
        ArrayList arrayList = new ArrayList(gl.r.v(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC3458yg.a((ContentValues) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0051  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, Integer num, kotlin.coroutines.jvm.internal.d dVar) {
        C3355ug c3355ug;
        String str2;
        if (dVar instanceof C3355ug) {
            c3355ug = (C3355ug) dVar;
            int i10 = c3355ug.f27629c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3355ug.f27629c = i10 - Integer.MIN_VALUE;
            } else {
                c3355ug = new C3355ug(this, dVar);
            }
        } else {
            c3355ug = new C3355ug(this, dVar);
        }
        Object objA = c3355ug.f27627a;
        Object objF = ll.b.f();
        int i11 = c3355ug.f27629c;
        if (i11 == 0) {
            fl.s.b(objA);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (num != null) {
                str2 = " LIMIT " + num.intValue();
                if (str2 == null) {
                    str2 = "";
                }
            } else {
                str2 = "";
            }
            String str3 = "SELECT * FROM pings WHERE priority='" + str + "' AND retryAfter<=" + jCurrentTimeMillis + " ORDER BY time_created ASC" + str2;
            C3167n9 c3167n9 = this.f27857a;
            c3355ug.f27629c = 1;
            c3167n9.getClass();
            objA = c3167n9.a(new C3063j9(c3167n9, str3, null), c3355ug);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(objA);
        }
        Iterable iterable = (Iterable) objA;
        ArrayList arrayList = new ArrayList(gl.r.v(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC3458yg.a((ContentValues) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, kotlin.coroutines.jvm.internal.d dVar) {
        C3329tg c3329tg;
        if (dVar instanceof C3329tg) {
            c3329tg = (C3329tg) dVar;
            int i10 = c3329tg.f27555d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3329tg.f27555d = i10 - Integer.MIN_VALUE;
            } else {
                c3329tg = new C3329tg(this, dVar);
            }
        } else {
            c3329tg = new C3329tg(this, dVar);
        }
        Object objA = c3329tg.f27553b;
        Object objF = ll.b.f();
        int i11 = c3329tg.f27555d;
        if (i11 == 0) {
            fl.s.b(objA);
            C3167n9 c3167n9 = this.f27857a;
            c3329tg.f27555d = 1;
            c3167n9.getClass();
            objA = c3167n9.a(new C3063j9(c3167n9, "SELECT * FROM pings WHERE priority='" + str + "' ORDER BY time_created ASC LIMIT 1", null), c3329tg);
            if (objA != objF) {
            }
            return objF;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Zf zf2 = c3329tg.f27552a;
            fl.s.b(objA);
            return zf2;
        }
        fl.s.b(objA);
        Iterable iterable = (Iterable) objA;
        ArrayList arrayList = new ArrayList(gl.r.v(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC3458yg.a((ContentValues) it.next()));
        }
        Zf zf3 = (Zf) gl.r.d0(arrayList);
        if (zf3 != null) {
            C3167n9 c3167n10 = this.f27857a;
            String[] strArr = {zf3.f26142b};
            c3329tg.f27552a = zf3;
            c3329tg.f27555d = 2;
            if (c3167n10.a("pings", "id=?", strArr, c3329tg) == objF) {
                return objF;
            }
        }
        return zf3;
    }

    public final Object a(long j10, kotlin.coroutines.jvm.internal.d dVar) {
        String strValueOf = String.valueOf(System.currentTimeMillis() - j10);
        Object objA = C3167n9.a(this.f27857a, "pings", "time_created<" + strValueOf, dVar, 4);
        return objA == ll.b.f() ? objA : fl.g0.f38750a;
    }
}
