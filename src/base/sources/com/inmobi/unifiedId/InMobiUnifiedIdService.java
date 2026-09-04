package com.inmobi.unifiedId;

import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.media.AbstractC2972fl;
import com.inmobi.media.C2843al;
import com.inmobi.media.H9;
import com.inmobi.media.M9;
import com.inmobi.media.N9;
import com.inmobi.media.P9;
import com.inmobi.media.R9;
import com.inmobi.media.Xi;
import em.k;
import fl.g0;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kl.f;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import ll.b;
import nm.a;
import nm.g;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0081@¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/inmobi/unifiedId/InMobiUnifiedIdService;", "", "Lcom/inmobi/unifiedId/InMobiUserDataModel;", "inMobiUserDataModel", "Lfl/g0;", "push", "(Lcom/inmobi/unifiedId/InMobiUserDataModel;)V", "Lcom/inmobi/unifiedId/InMobiUnifiedIdInterface;", "inMobiUnifiedIdInterface", "fetchUnifiedIds", "(Lcom/inmobi/unifiedId/InMobiUnifiedIdInterface;)V", "fetchUnifiedIdsInternal$media_release", "(Lcom/inmobi/unifiedId/InMobiUnifiedIdInterface;Lkl/f;)Ljava/lang/Object;", "fetchUnifiedIdsInternal", "reset", "()V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isPushCalled", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "isPushCalled$annotations", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InMobiUnifiedIdService {
    public static final InMobiUnifiedIdService INSTANCE = new InMobiUnifiedIdService();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f28044a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f28045b = g.b(false, 1, null);

    public static final Object a(InMobiUnifiedIdInterface inMobiUnifiedIdInterface, f fVar) {
        s.g("InMobiUnifiedIdService", "TAG");
        JSONObject jSONObjectB = M9.b();
        if (!AbstractC2972fl.b(jSONObjectB) && jSONObjectB != null && AbstractC2972fl.c(jSONObjectB)) {
            Object objA = C2843al.a(inMobiUnifiedIdInterface, fVar);
            return objA == b.f() ? objA : g0.f38750a;
        }
        if (inMobiUnifiedIdInterface != null) {
            if (!AbstractC2972fl.b(jSONObjectB)) {
                AbstractC2972fl.a(inMobiUnifiedIdInterface, jSONObjectB, null);
            } else {
                if (f28044a.get()) {
                    Object objA2 = C2843al.a(inMobiUnifiedIdInterface, fVar);
                    return objA2 == b.f() ? objA2 : g0.f38750a;
                }
                AbstractC2972fl.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.PUSH_NEEDS_TO_BE_CALLED_FIRST));
            }
        }
        return g0.f38750a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        if (r7 == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$resetInternal(kl.f r7) {
        /*
            boolean r0 = r7 instanceof com.inmobi.media.S9
            if (r0 == 0) goto L13
            r0 = r7
            com.inmobi.media.S9 r0 = (com.inmobi.media.S9) r0
            int r1 = r0.f25680b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25680b = r1
            goto L18
        L13:
            com.inmobi.media.S9 r0 = new com.inmobi.media.S9
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f25679a
            java.lang.Object r1 = ll.b.f()
            int r2 = r0.f25680b
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            fl.s.b(r7)
            goto L6d
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            fl.s.b(r7)
            goto L52
        L3a:
            fl.s.b(r7)
            java.lang.String r7 = "InMobiUnifiedIdService"
            java.lang.String r2 = "TAG"
            kotlin.jvm.internal.s.g(r7, r2)
            java.util.concurrent.atomic.AtomicBoolean r7 = com.inmobi.unifiedId.InMobiUnifiedIdService.f28044a
            r7.set(r5)
            r0.f25680b = r4
            java.lang.Object r7 = com.inmobi.media.C2932e7.a(r6, r0)
            if (r7 != r1) goto L52
            goto L6c
        L52:
            com.inmobi.media.al r7 = com.inmobi.media.C2843al.f26226a
            r0.f25680b = r3
            com.inmobi.media.zh r7 = com.inmobi.media.C2843al.f26227b
            com.inmobi.media.Zk r2 = new com.inmobi.media.Zk
            r2.<init>(r6)
            java.lang.Object r7 = com.inmobi.media.J3.a(r7, r2, r0)
            java.lang.Object r0 = ll.b.f()
            if (r7 != r0) goto L68
            goto L6a
        L68:
            fl.g0 r7 = fl.g0.f38750a
        L6a:
            if (r7 != r1) goto L6d
        L6c:
            return r1
        L6d:
            com.inmobi.media.M9.b(r6)
            com.inmobi.media.M9.a(r6)
            com.inmobi.media.M9.f25257d = r5
            com.inmobi.media.M9.f25256c = r5
            fl.g0 r7 = fl.g0.f38750a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.unifiedId.InMobiUnifiedIdService.access$resetInternal(kl.f):java.lang.Object");
    }

    public static final void fetchUnifiedIds(InMobiUnifiedIdInterface inMobiUnifiedIdInterface) {
        s.g("InMobiUnifiedIdService", "TAG");
        if (Xi.d()) {
            k.d(H9.f24930c, null, null, new N9(inMobiUnifiedIdInterface, null), 3, null);
        } else {
            s.g("InMobiUnifiedIdService", "TAG");
            throw new SdkNotInitializedException("InMobiUnifiedIdService");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x012c, code lost:
    
        if (a(r12, r0) == r1) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object fetchUnifiedIdsInternal$media_release(com.inmobi.unifiedId.InMobiUnifiedIdInterface r12, kl.f r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.unifiedId.InMobiUnifiedIdService.fetchUnifiedIdsInternal$media_release(com.inmobi.unifiedId.InMobiUnifiedIdInterface, kl.f):java.lang.Object");
    }

    public static final void push(InMobiUserDataModel inMobiUserDataModel) {
        s.g("InMobiUnifiedIdService", "TAG");
        Objects.toString(inMobiUserDataModel);
        if (Xi.d()) {
            k.d(H9.f24930c, null, null, new P9(inMobiUserDataModel, null), 3, null);
        } else {
            s.g("InMobiUnifiedIdService", "TAG");
            throw new SdkNotInitializedException("InMobiUnifiedIdService");
        }
    }

    public static final void reset() {
        s.g("InMobiUnifiedIdService", "TAG");
        if (Xi.d()) {
            k.d(H9.f24930c, null, null, new R9(null), 3, null);
        } else {
            s.g("InMobiUnifiedIdService", "TAG");
            throw new SdkNotInitializedException("InMobiUnifiedIdService");
        }
    }

    public final AtomicBoolean isPushCalled() {
        return f28044a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f3, code lost:
    
        if (r9.a((kotlin.coroutines.jvm.internal.d) r0) == r1) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.inmobi.unifiedId.InMobiUserDataModel r9, kl.f r10) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.unifiedId.InMobiUnifiedIdService.a(com.inmobi.unifiedId.InMobiUserDataModel, kl.f):java.lang.Object");
    }

    public static /* synthetic */ void isPushCalled$annotations() {
    }
}
