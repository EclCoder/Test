package com.inmobi.media;

import android.media.MediaPlayer;
import com.inmobi.media.AbstractC2923dn;
import java.io.IOException;

/* JADX INFO: renamed from: com.inmobi.media.dn, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2923dn {
    /* JADX WARN: Code duplicated, block: B:17:0x0049  */
    /* JADX WARN: Code duplicated, block: B:20:0x0057  */
    /* JADX WARN: Code duplicated, block: B:23:0x0083 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0084  */
    /* JADX WARN: Code duplicated, block: B:33:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:? A[LOOP:0: B:15:0x0043->B:35:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0084 -> B:25:0x0088). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(android.media.MediaPlayer r7, java.util.ArrayList r8, com.inmobi.media.C3348u9 r9, kotlin.coroutines.jvm.internal.d r10) {
        /*
            boolean r0 = r10 instanceof com.inmobi.media.Wm
            if (r0 == 0) goto L13
            r0 = r10
            com.inmobi.media.Wm r0 = (com.inmobi.media.Wm) r0
            int r1 = r0.f25980f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25980f = r1
            goto L18
        L13:
            com.inmobi.media.Wm r0 = new com.inmobi.media.Wm
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f25979e
            java.lang.Object r1 = ll.b.f()
            int r2 = r0.f25980f
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.String r7 = r0.f25978d
            java.util.Iterator r8 = r0.f25977c
            com.inmobi.media.t9 r9 = r0.f25976b
            android.media.MediaPlayer r2 = r0.f25975a
            fl.s.b(r10)
            goto L88
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            fl.s.b(r10)
            a(r7, r9)
            java.util.Iterator r8 = r8.iterator()
        L43:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L98
            java.lang.Object r10 = r8.next()
            java.lang.String r10 = (java.lang.String) r10
            boolean r2 = android.webkit.URLUtil.isNetworkUrl(r10)
            if (r2 == 0) goto L43
            if (r9 == 0) goto L70
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Video Loading for URL: "
            r2.append(r4)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            r4 = r9
            com.inmobi.media.u9 r4 = (com.inmobi.media.C3348u9) r4
            java.lang.String r5 = "VideoLoaderHelper"
            r4.a(r5, r2)
        L70:
            r7.reset()
            r0.f25975a = r7
            r0.f25976b = r9
            r0.f25977c = r8
            r0.f25978d = r10
            r0.f25980f = r3
            java.lang.Object r2 = a(r7, r10, r9, r0)
            if (r2 != r1) goto L84
            return r1
        L84:
            r6 = r2
            r2 = r7
            r7 = r10
            r10 = r6
        L88:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L96
            com.inmobi.media.Um r8 = new com.inmobi.media.Um
            r8.<init>(r7)
            return r8
        L96:
            r7 = r2
            goto L43
        L98:
            com.inmobi.media.Qm r7 = com.inmobi.media.Qm.f25570a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC2923dn.a(android.media.MediaPlayer, java.util.ArrayList, com.inmobi.media.u9, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public static final void a(MediaPlayer mediaPlayer, final C3348u9 c3348u9) {
        mediaPlayer.setOnBufferingUpdateListener(new MediaPlayer.OnBufferingUpdateListener() { // from class: yh.h8
            @Override // android.media.MediaPlayer.OnBufferingUpdateListener
            public final void onBufferingUpdate(MediaPlayer mediaPlayer2, int i10) {
                AbstractC2923dn.a(c3348u9, mediaPlayer2, i10);
            }
        });
    }

    public static final void a(InterfaceC3322t9 interfaceC3322t9, MediaPlayer mediaPlayer, int i10) {
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("VideoLoaderHelper", "Buffering Percentage: " + i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x011a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0122  */
    /* JADX WARN: Code duplicated, block: B:56:0x0140 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x0141  */
    /* JADX WARN: Code duplicated, block: B:63:0x0165 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0167  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0141 -> B:58:0x0146). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(androidx.media3.exoplayer.o r14, java.util.ArrayList r15, com.inmobi.media.InterfaceC3322t9 r16, com.inmobi.media.L2 r17, boolean r18, kotlin.coroutines.jvm.internal.d r19) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC2923dn.a(androidx.media3.exoplayer.o, java.util.ArrayList, com.inmobi.media.t9, com.inmobi.media.L2, boolean, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public static final Object a(MediaPlayer mediaPlayer, String str, InterfaceC3322t9 interfaceC3322t9, Wm wm2) {
        em.q qVar = new em.q(ll.b.c(wm2), 1);
        qVar.H();
        qVar.i(new Ym(mediaPlayer));
        try {
            mediaPlayer.setOnPreparedListener(new Zm(interfaceC3322t9, str, qVar));
            mediaPlayer.setOnErrorListener(new C2845an(interfaceC3322t9, str, qVar));
            mediaPlayer.setDataSource(str);
            mediaPlayer.prepareAsync();
        } catch (IOException e10) {
            if (interfaceC3322t9 != null) {
                ((C3348u9) interfaceC3322t9).b("VideoLoaderHelper", "Video Load Exception: " + e10.getMessage());
            }
            T4.a(qVar, kotlin.coroutines.jvm.internal.b.a(false));
        } catch (IllegalStateException e11) {
            if (interfaceC3322t9 != null) {
                ((C3348u9) interfaceC3322t9).b("VideoLoaderHelper", "Video Load Exception: " + e11.getMessage());
            }
            T4.a(qVar, kotlin.coroutines.jvm.internal.b.a(false));
        }
        Object objB = qVar.B();
        if (objB == ll.b.f()) {
            kotlin.coroutines.jvm.internal.h.c(wm2);
        }
        return objB;
    }

    public static final Object a(androidx.media3.exoplayer.o oVar, String str, InterfaceC3322t9 interfaceC3322t9, L2 l10, boolean z10, Xm xm2) {
        em.q qVar = new em.q(ll.b.c(xm2), 1);
        qVar.H();
        C2897cn c2897cn = new C2897cn(qVar, l10, str, interfaceC3322t9, oVar);
        qVar.i(new C2871bn(oVar, c2897cn));
        if (interfaceC3322t9 != null) {
            try {
                ((C3348u9) interfaceC3322t9).a("VideoLoaderHelper", "Trying URL with cache " + z10 + ": " + str);
            } catch (Exception e10) {
                if (interfaceC3322t9 != null) {
                    ((C3348u9) interfaceC3322t9).b("VideoLoaderHelper", "Exception during media source preparation for URL (" + str + "): " + e10.getMessage());
                }
                oVar.n(c2897cn);
                if (qVar.L()) {
                    T4.a(qVar, new C2985g8(Rm.UNKNOWN));
                }
                oVar.stop();
                oVar.b();
            }
        }
        androidx.media3.exoplayer.source.r rVarA = l10.a(str, z10);
        oVar.q(c2897cn);
        oVar.p(rVarA);
        oVar.a();
        Object objB = qVar.B();
        if (objB == ll.b.f()) {
            kotlin.coroutines.jvm.internal.h.c(xm2);
        }
        return objB;
    }
}
