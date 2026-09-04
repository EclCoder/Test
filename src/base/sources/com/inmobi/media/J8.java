package com.inmobi.media;

import com.mbridge.msdk.foundation.download.Command;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class J8 extends AbstractC3252qg {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3243q7 f25052d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J8(C3433xg dao) {
        super(dao);
        kotlin.jvm.internal.s.h(dao, "dao");
        this.f25052d = new C3243q7(dao, new I8(this), this.f27340c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Zf zf2, kotlin.coroutines.jvm.internal.d dVar) {
        G8 g10;
        if (dVar instanceof G8) {
            g10 = (G8) dVar;
            int i10 = g10.f24846d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                g10.f24846d = i10 - Integer.MIN_VALUE;
            } else {
                g10 = new G8(this, dVar);
            }
        } else {
            g10 = new G8(this, dVar);
        }
        Object objA = g10.f24844b;
        Object objF = ll.b.f();
        int i11 = g10.f24846d;
        if (i11 == 0) {
            fl.s.b(objA);
            C3251qf c3251qf = this.f27340c;
            g10.f24843a = zf2;
            g10.f24846d = 1;
            c3251qf.getClass();
            HashMap map = new HashMap(zf2.f26143c);
            map.put(Command.HTTP_HEADER_USER_AGENT, Xi.c());
            objA = c3251qf.f27337a.f24525a.a(new Re(zf2.f26141a, map, null, null, null, zf2.f26144d, 28), g10);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zf2 = g10.f24843a;
            fl.s.b(objA);
        }
        Ve ve2 = (Ve) objA;
        return new C2967fg(zf2, ve2.c(), ve2.e());
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00aa A[Catch: Error -> 0x00b9, Exception -> 0x00bd, TryCatch #5 {Error -> 0x00b9, Exception -> 0x00bd, blocks: (B:47:0x00a2, B:49:0x00aa, B:55:0x00c1, B:58:0x00db), top: B:104:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00c1 A[Catch: Error -> 0x00b9, Exception -> 0x00bd, TryCatch #5 {Error -> 0x00b9, Exception -> 0x00bd, blocks: (B:47:0x00a2, B:49:0x00aa, B:55:0x00c1, B:58:0x00db), top: B:104:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00da  */
    /* JADX WARN: Code duplicated, block: B:58:0x00db A[Catch: Error -> 0x00b9, Exception -> 0x00bd, TRY_LEAVE, TryCatch #5 {Error -> 0x00b9, Exception -> 0x00bd, blocks: (B:47:0x00a2, B:49:0x00aa, B:55:0x00c1, B:58:0x00db), top: B:104:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fb A[Catch: Error -> 0x0054, Exception -> 0x0057, TryCatch #4 {Error -> 0x0054, Exception -> 0x0057, blocks: (B:24:0x004f, B:66:0x00f3, B:68:0x00fb, B:72:0x0123, B:75:0x012a, B:71:0x0121, B:78:0x0130, B:31:0x005e, B:34:0x0069), top: B:103:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0120  */
    /* JADX WARN: Code duplicated, block: B:71:0x0121 A[Catch: Error -> 0x0054, Exception -> 0x0057, TryCatch #4 {Error -> 0x0054, Exception -> 0x0057, blocks: (B:24:0x004f, B:66:0x00f3, B:68:0x00fb, B:72:0x0123, B:75:0x012a, B:71:0x0121, B:78:0x0130, B:31:0x005e, B:34:0x0069), top: B:103:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0129  */
    /* JADX WARN: Code duplicated, block: B:75:0x012a A[Catch: Error -> 0x0054, Exception -> 0x0057, TryCatch #4 {Error -> 0x0054, Exception -> 0x0057, blocks: (B:24:0x004f, B:66:0x00f3, B:68:0x00fb, B:72:0x0123, B:75:0x012a, B:71:0x0121, B:78:0x0130, B:31:0x005e, B:34:0x0069), top: B:103:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x012e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0130 A[Catch: Error -> 0x0054, Exception -> 0x0057, TRY_LEAVE, TryCatch #4 {Error -> 0x0054, Exception -> 0x0057, blocks: (B:24:0x004f, B:66:0x00f3, B:68:0x00fb, B:72:0x0123, B:75:0x012a, B:71:0x0121, B:78:0x0130, B:31:0x005e, B:34:0x0069), top: B:103:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0143  */
    /* JADX WARN: Code duplicated, block: B:88:0x0164  */
    /* JADX WARN: Code duplicated, block: B:89:0x016c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code duplicated, block: B:96:0x019d  */
    /* JADX WARN: Code duplicated, block: B:97:0x01a5  */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x014f, code lost:
    
        if (r0.a(r15) == r1) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0189, code lost:
    
        if (r14.a(r15) == r1) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01c1, code lost:
    
        if (r14.a(r15) == r1) goto L100;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.inmobi.media.Zf r14, kotlin.coroutines.jvm.internal.d r15) {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.J8.b(com.inmobi.media.Zf, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
