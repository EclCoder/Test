package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Kh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B9 f25123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3291s4 f25125c;

    public Kh(B9 configClient) {
        kotlin.jvm.internal.s.h(configClient, "configClient");
        this.f25123a = configClient;
        this.f25124b = Kh.class.getSimpleName();
        this.f25125c = new C3291s4();
    }

    public static final boolean a(Set set, C3240q4 it) {
        kotlin.jvm.internal.s.h(it, "it");
        return set.contains(it.f27311b.getType());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    public final AbstractC3317t4 a(C3265r4 c3265r4, C3240q4 c3240q4) {
        C3005h2 c3005h2B;
        String configType = c3240q4.f27311b.getType();
        kotlin.jvm.internal.s.h(c3265r4, "<this>");
        kotlin.jvm.internal.s.h(configType, "configType");
        switch (configType) {
            case "crashReporting":
                c3005h2B = c3265r4.b();
                break;
            case "ads":
                c3005h2B = c3265r4.a();
                break;
            case "root":
                c3005h2B = c3265r4.c();
                break;
            case "telemetry":
                c3005h2B = c3265r4.e();
                break;
            case "signals":
                c3005h2B = c3265r4.d();
                break;
            default:
                c3005h2B = null;
                break;
        }
        if (c3005h2B == null) {
            return new C2955f4(5, c3240q4.f27311b.getLastUpdateTimeStamp(), c3240q4.f27311b.getType());
        }
        Al alA = this.f25125c.a(c3005h2B, c3240q4);
        int i10 = alA.f24486a;
        if (i10 == 200) {
            Config config = alA.f24487b;
            config.setLastUpdateTimeStamp(System.currentTimeMillis());
            String tag = this.f25124b;
            kotlin.jvm.internal.s.g(tag, "tag");
            c3240q4.f27311b.getType();
            return new C3343u4(200, config);
        }
        if (i10 != 304) {
            return new C2955f4(alA.f24486a, c3240q4.f27311b.getLastUpdateTimeStamp(), c3240q4.f27311b.getType());
        }
        Config config2 = alA.f24487b;
        config2.setLastUpdateTimeStamp(System.currentTimeMillis());
        String tag2 = this.f25124b;
        kotlin.jvm.internal.s.g(tag2, "tag");
        c3240q4.f27311b.getType();
        return new C3343u4(304, config2);
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0333  */
    /* JADX WARN: Code duplicated, block: B:116:0x0364 A[LOOP:3: B:111:0x032d->B:116:0x0364, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:119:0x0372  */
    /* JADX WARN: Code duplicated, block: B:120:0x0377  */
    /* JADX WARN: Code duplicated, block: B:123:0x038c A[LOOP:5: B:121:0x0386->B:123:0x038c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:127:0x03b3 A[LOOP:6: B:125:0x03ad->B:127:0x03b3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:132:0x03ee A[LOOP:4: B:130:0x03e8->B:132:0x03ee, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:134:0x041a  */
    /* JADX WARN: Code duplicated, block: B:137:0x0430  */
    /* JADX WARN: Code duplicated, block: B:139:0x043c  */
    /* JADX WARN: Code duplicated, block: B:141:0x0459 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:143:0x045d  */
    /* JADX WARN: Code duplicated, block: B:145:0x0460  */
    /* JADX WARN: Code duplicated, block: B:147:0x0468  */
    /* JADX WARN: Code duplicated, block: B:150:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:157:0x0202 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x0360 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:73:0x022d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0256 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:83:0x0264 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0266  */
    /* JADX WARN: Code duplicated, block: B:86:0x0279  */
    /* JADX WARN: Code duplicated, block: B:87:0x0280  */
    /* JADX WARN: Code duplicated, block: B:89:0x0285  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:150:0x04a0 -> B:151:0x04a4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(java.lang.String r25, java.lang.String r26, com.inmobi.media.core.config.models.RootConfig r27, java.util.List r28, gm.s r29, kotlin.coroutines.jvm.internal.d r30) {
        /*
            Method dump skipped, instruction units count: 1235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Kh.a(java.lang.String, java.lang.String, com.inmobi.media.core.config.models.RootConfig, java.util.List, gm.s, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0052 A[Catch: ClassCastException -> 0x0074, JSONException -> 0x0079, TryCatch #3 {ClassCastException -> 0x0074, JSONException -> 0x0079, blocks: (B:12:0x002a, B:21:0x004e, B:23:0x0052, B:24:0x0056, B:26:0x005c, B:28:0x006b, B:29:0x0072), top: B:39:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:26:0x005c A[Catch: ClassCastException -> 0x0074, JSONException -> 0x0079, LOOP:0: B:24:0x0056->B:26:0x005c, LOOP_END, TryCatch #3 {ClassCastException -> 0x0074, JSONException -> 0x0079, blocks: (B:12:0x002a, B:21:0x004e, B:23:0x0052, B:24:0x0056, B:26:0x005c, B:28:0x006b, B:29:0x0072), top: B:39:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:28:0x006b A[Catch: ClassCastException -> 0x0074, JSONException -> 0x0079, TryCatch #3 {ClassCastException -> 0x0074, JSONException -> 0x0079, blocks: (B:12:0x002a, B:21:0x004e, B:23:0x0052, B:24:0x0056, B:26:0x005c, B:28:0x006b, B:29:0x0072), top: B:39:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Ve ve2, List list, kotlin.coroutines.jvm.internal.d dVar) {
        Jh jh2;
        ArrayList arrayList;
        C3265r4 c3265r4;
        Iterator it;
        if (dVar instanceof Jh) {
            jh2 = (Jh) dVar;
            int i10 = jh2.f25076e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jh2.f25076e = i10 - Integer.MIN_VALUE;
            } else {
                jh2 = new Jh(this, dVar);
            }
        } else {
            jh2 = new Jh(this, dVar);
        }
        Object obj = jh2.f25074c;
        Object objF = ll.b.f();
        int i11 = jh2.f25076e;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = jh2.f25073b;
            list = jh2.f25072a;
            try {
                fl.s.b(obj);
                c3265r4 = (C3265r4) obj;
                if (c3265r4 != null) {
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(a(c3265r4, (C3240q4) it.next()));
                    }
                    return arrayList;
                }
                throw new JSONException("Error parsing config response");
            } catch (ClassCastException unused) {
                a(list, 2);
                return arrayList;
            } catch (JSONException unused2) {
                a(list, 2);
                return arrayList;
            }
        }
        fl.s.b(obj);
        ArrayList arrayList2 = new ArrayList();
        try {
            jh2.f25072a = list;
            jh2.f25073b = arrayList2;
            jh2.f25076e = 1;
            Object objA = ve2.a();
            if (objA == objF) {
                return objF;
            }
            obj = objA;
            arrayList = arrayList2;
            c3265r4 = (C3265r4) obj;
            if (c3265r4 != null) {
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(a(c3265r4, (C3240q4) it.next()));
                }
                return arrayList;
            }
            throw new JSONException("Error parsing config response");
        } catch (ClassCastException unused3) {
            arrayList = arrayList2;
            a(list, 2);
            return arrayList;
        } catch (JSONException unused4) {
            arrayList = arrayList2;
            a(list, 2);
            return arrayList;
        }
        return arrayList;
    }

    public static void a(int i10, List list, List list2) {
        Map mapM = gl.l0.m(fl.w.a("errorCode", Integer.valueOf(i10)), fl.w.a("name", list), fl.w.a("lts", list2), fl.w.a("networkType", B5.o()));
        C3178nk c3178nk = C3178nk.f27064a;
        C3178nk.b("InvalidConfig", mapM, EnumC3281rk.SDK);
    }

    public static void a(List list, int i10) {
        ArrayList arrayList = new ArrayList(gl.r.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C3240q4) it.next()).f27311b.getType());
        }
        ArrayList arrayList2 = new ArrayList(gl.r.v(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Long.valueOf(((C3240q4) it2.next()).f27311b.getLastUpdateTimeStamp()));
        }
        a(i10, arrayList, arrayList2);
    }
}
