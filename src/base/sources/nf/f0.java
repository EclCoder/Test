package nf;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.inmobi.media.core.config.models.AdConfig;
import com.k2fsa.sherpa.onnx.FeatureConfig;
import com.k2fsa.sherpa.onnx.OfflineModelConfig;
import com.k2fsa.sherpa.onnx.OfflineRecognizer;
import com.k2fsa.sherpa.onnx.OfflineRecognizerConfig;
import com.k2fsa.sherpa.onnx.OfflineRecognizerResult;
import com.k2fsa.sherpa.onnx.OfflineStream;
import com.k2fsa.sherpa.onnx.OfflineWhisperModelConfig;
import com.k2fsa.sherpa.onnx.SileroVadModelConfig;
import com.k2fsa.sherpa.onnx.SpeechSegment;
import com.k2fsa.sherpa.onnx.Vad;
import com.k2fsa.sherpa.onnx.VadModelConfig;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import em.c1;
import em.p0;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.k0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f47576a = new f0();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final RandomAccessFile f47577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f47578b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte[] f47579c;

        public a(File wav) throws IOException {
            kotlin.jvm.internal.s.h(wav, "wav");
            RandomAccessFile randomAccessFile = new RandomAccessFile(wav, CampaignEx.JSON_KEY_AD_R);
            this.f47577a = randomAccessFile;
            this.f47578b = (int) (yl.g.e(randomAccessFile.length() - 44, 0L) / 2);
            this.f47579c = new byte[0];
            randomAccessFile.seek(44L);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            try {
                fl.r.a aVar = fl.r.f38769b;
                this.f47577a.close();
                fl.r.b(fl.g0.f38750a);
            } catch (Throwable th2) {
                fl.r.a aVar2 = fl.r.f38769b;
                fl.r.b(fl.s.a(th2));
            }
        }

        public final int d() {
            return this.f47578b;
        }

        public final int h(float[] out, int i10) throws IOException {
            kotlin.jvm.internal.s.h(out, "out");
            int i11 = i10 * 2;
            if (this.f47579c.length < i11) {
                this.f47579c = new byte[i11];
            }
            int i12 = 0;
            while (i12 < i11) {
                int i13 = this.f47577a.read(this.f47579c, i12, i11 - i12);
                if (i13 < 0) {
                    break;
                }
                i12 += i13;
            }
            int i14 = i12 / 2;
            int i15 = 0;
            for (int i16 = 0; i16 < i14; i16++) {
                byte[] bArr = this.f47579c;
                out[i16] = ((bArr[i15 + 1] << 8) | (bArr[i15] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) / 32768.0f;
                i15 += 2;
            }
            return i14;
        }

        public final void k() throws IOException {
            this.f47577a.seek(44L);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f47580r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f47581s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ File f47582t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ File f47583u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ String f47584v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ File f47585w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ File f47586x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final /* synthetic */ File f47587y;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return jl.a.a(Long.valueOf(((of.h) obj).b()), Long.valueOf(((of.h) obj2).b()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(File file, File file2, String str, File file3, File file4, File file5, kl.f fVar) {
            super(2, fVar);
            this.f47582t = file;
            this.f47583u = file2;
            this.f47584v = str;
            this.f47585w = file3;
            this.f47586x = file4;
            this.f47587y = file5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fl.g0 q() {
            return fl.g0.f38750a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            b bVar = new b(this.f47582t, this.f47583u, this.f47584v, this.f47585w, this.f47586x, this.f47587y, fVar);
            bVar.f47581s = obj;
            return bVar;
        }

        /* JADX WARN: Code duplicated, block: B:282:0x0627  */
        /* JADX WARN: Code duplicated, block: B:288:0x0641 A[Catch: all -> 0x0647, TryCatch #22 {all -> 0x0647, blocks: (B:286:0x063b, B:288:0x0641, B:292:0x064a), top: B:368:0x063b }] */
        /* JADX WARN: Code duplicated, block: B:291:0x0649  */
        /* JADX WARN: Code duplicated, block: B:297:0x065d A[Catch: all -> 0x05ae, TRY_LEAVE, TryCatch #9 {all -> 0x05ae, blocks: (B:295:0x0657, B:297:0x065d, B:267:0x05b1, B:261:0x05a2, B:263:0x05a8), top: B:345:0x0036 }] */
        /* JADX WARN: Code duplicated, block: B:299:0x0664  */
        /* JADX WARN: Code duplicated, block: B:302:0x0675 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str;
            fl.g0 g0Var;
            fl.g0 g0Var2;
            fl.g0 g0Var3;
            String message;
            OfflineRecognizer offlineRecognizer;
            fl.g0 g0Var4;
            Vad vad;
            fl.g0 g0Var5;
            tl.a aVar;
            fl.g0 g0Var6;
            a aVar2;
            Throwable th2;
            Object obj2;
            int i10;
            a aVar3;
            double d10;
            ArrayList arrayList;
            boolean z10;
            fl.g0 g0Var7;
            fl.g0 g0Var8;
            fl.g0 g0Var9;
            float[] fArr;
            fl.g0 g0Var10;
            fl.g0 g0Var11;
            Object obj3;
            fl.g0 g0Var12;
            String str2 = "";
            Object objF = ll.b.f();
            int i11 = this.f47580r;
            int i12 = 1;
            if (i11 == 0) {
                fl.s.b(obj);
                gm.s sVar = (gm.s) this.f47581s;
                sVar.e(h0.c.f47593a);
                k0 k0Var = new k0();
                k0 k0Var2 = new k0();
                fl.g0 g0Var13 = null;
                fl.g0 g0Var14 = null;
                Throwable th3 = null;
                try {
                    try {
                        FeatureConfig featureConfig = new FeatureConfig(16000, 80, 0.0f, 4, null);
                        String absolutePath = this.f47582t.getAbsolutePath();
                        kotlin.jvm.internal.s.g(absolutePath, "getAbsolutePath(...)");
                        String absolutePath2 = this.f47583u.getAbsolutePath();
                        kotlin.jvm.internal.s.g(absolutePath2, "getAbsolutePath(...)");
                        OfflineWhisperModelConfig offlineWhisperModelConfig = new OfflineWhisperModelConfig(absolutePath, absolutePath2, this.f47584v, "transcribe", 0, true, false, 80, null);
                        String absolutePath3 = this.f47585w.getAbsolutePath();
                        kotlin.jvm.internal.s.g(absolutePath3, "getAbsolutePath(...)");
                        str = null;
                        k0Var.f43597a = new OfflineRecognizer(null, new OfflineRecognizerConfig(featureConfig, new OfflineModelConfig(null, null, offlineWhisperModelConfig, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, f0.f47576a.d(), false, "cpu", null, absolutePath3, null, null, 28049403, null), null, "greedy_search", 0, null, 0.0f, null, null, 0.0f, TTAdConstant.IMAGE_MODE_1012, null), 1, null);
                        String absolutePath4 = this.f47586x.getAbsolutePath();
                        kotlin.jvm.internal.s.g(absolutePath4, "getAbsolutePath(...)");
                        k0Var2.f43597a = new Vad(null, new VadModelConfig(new SileroVadModelConfig(absolutePath4, 0.35f, 0.25f, 0.25f, 512, 28.0f), null, 16000, 1, "cpu", false, 34, null), 1, null);
                        if (!p0.f(sVar)) {
                            gm.u.f(sVar, null, 1, null);
                            fl.g0 g0Var15 = fl.g0.f38750a;
                            try {
                                fl.r.a aVar4 = fl.r.f38769b;
                                Vad vad2 = (Vad) k0Var2.f43597a;
                                if (vad2 != null) {
                                    vad2.release();
                                    g0Var12 = g0Var15;
                                } else {
                                    g0Var12 = null;
                                }
                                fl.r.b(g0Var12);
                            } catch (Throwable th4) {
                                fl.r.a aVar5 = fl.r.f38769b;
                                fl.r.b(fl.s.a(th4));
                            }
                            try {
                                OfflineRecognizer offlineRecognizer2 = (OfflineRecognizer) k0Var.f43597a;
                                if (offlineRecognizer2 != null) {
                                    offlineRecognizer2.release();
                                    g0Var14 = fl.g0.f38750a;
                                }
                                fl.r.b(g0Var14);
                            } catch (Throwable th5) {
                                fl.r.a aVar6 = fl.r.f38769b;
                                fl.r.b(fl.s.a(th5));
                            }
                            return g0Var15;
                        }
                        a aVar7 = new a(this.f47587y);
                        int iD = aVar7.d();
                        try {
                            try {
                                try {
                                    try {
                                        if (iD <= 0) {
                                            try {
                                                fl.r.a aVar8 = fl.r.f38769b;
                                                aVar7.close();
                                                fl.r.b(fl.g0.f38750a);
                                            } catch (Throwable th6) {
                                                fl.r.a aVar9 = fl.r.f38769b;
                                                fl.r.b(fl.s.a(th6));
                                            }
                                            sVar.e(new h0.a(gl.r.l()));
                                            gm.u.f(sVar, null, 1, null);
                                            fl.g0 g0Var16 = fl.g0.f38750a;
                                            try {
                                                Vad vad3 = (Vad) k0Var2.f43597a;
                                                if (vad3 != null) {
                                                    vad3.release();
                                                    g0Var6 = g0Var16;
                                                } else {
                                                    g0Var6 = null;
                                                }
                                                fl.r.b(g0Var6);
                                            } catch (Throwable th7) {
                                                fl.r.a aVar10 = fl.r.f38769b;
                                                fl.r.b(fl.s.a(th7));
                                            }
                                            try {
                                                OfflineRecognizer offlineRecognizer3 = (OfflineRecognizer) k0Var.f43597a;
                                                if (offlineRecognizer3 != null) {
                                                    offlineRecognizer3.release();
                                                    g0Var13 = fl.g0.f38750a;
                                                }
                                                fl.r.b(g0Var13);
                                            } catch (Throwable th8) {
                                                fl.r.a aVar11 = fl.r.f38769b;
                                                fl.r.b(fl.s.a(th8));
                                            }
                                            return g0Var16;
                                        }
                                        double d11 = 16000;
                                        double d12 = ((double) iD) / d11;
                                        sVar.e(new h0.d(0));
                                        ArrayList arrayList2 = new ArrayList();
                                        int i13 = 512;
                                        try {
                                            try {
                                                float[] fArr2 = new float[512];
                                                double d13 = 0.0d;
                                                boolean z11 = false;
                                                boolean z12 = false;
                                                int i14 = 0;
                                                int i15 = 0;
                                                while (true) {
                                                    if (!p0.f(sVar)) {
                                                        gm.u.f(sVar, th3, i12, th3);
                                                        fl.g0 g0Var17 = fl.g0.f38750a;
                                                        try {
                                                            fl.r.a aVar12 = fl.r.f38769b;
                                                            aVar7.close();
                                                            fl.r.b(g0Var17);
                                                        } catch (Throwable th9) {
                                                            fl.r.a aVar13 = fl.r.f38769b;
                                                            fl.r.b(fl.s.a(th9));
                                                        }
                                                        try {
                                                            Vad vad4 = (Vad) k0Var2.f43597a;
                                                            if (vad4 != null) {
                                                                vad4.release();
                                                                obj2 = fl.g0.f38750a;
                                                            } else {
                                                                obj2 = th3;
                                                            }
                                                            fl.r.b(obj2);
                                                        } catch (Throwable th10) {
                                                            fl.r.a aVar14 = fl.r.f38769b;
                                                            fl.r.b(fl.s.a(th10));
                                                        }
                                                        try {
                                                            OfflineRecognizer offlineRecognizer4 = (OfflineRecognizer) k0Var.f43597a;
                                                            Object obj4 = th3;
                                                            if (offlineRecognizer4 != null) {
                                                                offlineRecognizer4.release();
                                                                obj4 = fl.g0.f38750a;
                                                            }
                                                            fl.r.b(obj4);
                                                        } catch (Throwable th11) {
                                                            fl.r.a aVar15 = fl.r.f38769b;
                                                            fl.r.b(fl.s.a(th11));
                                                        }
                                                        return g0Var17;
                                                    }
                                                    if (aVar7.h(fArr2, i13) < i13) {
                                                        str = str2;
                                                        try {
                                                            ((Vad) k0Var2.f43597a).flush();
                                                            boolean z13 = z12;
                                                            int i16 = i14;
                                                            double d14 = d13;
                                                            while (!((Vad) k0Var2.f43597a).empty()) {
                                                                if (!p0.f(sVar)) {
                                                                    gm.u.f(sVar, null, 1, null);
                                                                    fl.g0 g0Var18 = fl.g0.f38750a;
                                                                    try {
                                                                        fl.r.a aVar16 = fl.r.f38769b;
                                                                        aVar7.close();
                                                                        fl.r.b(g0Var18);
                                                                    } catch (Throwable th12) {
                                                                        fl.r.a aVar17 = fl.r.f38769b;
                                                                        fl.r.b(fl.s.a(th12));
                                                                    }
                                                                    try {
                                                                        Vad vad5 = (Vad) k0Var2.f43597a;
                                                                        if (vad5 != null) {
                                                                            vad5.release();
                                                                            g0Var11 = fl.g0.f38750a;
                                                                        } else {
                                                                            g0Var11 = null;
                                                                        }
                                                                        fl.r.b(g0Var11);
                                                                    } catch (Throwable th13) {
                                                                        fl.r.a aVar18 = fl.r.f38769b;
                                                                        fl.r.b(fl.s.a(th13));
                                                                    }
                                                                    try {
                                                                        OfflineRecognizer offlineRecognizer5 = (OfflineRecognizer) k0Var.f43597a;
                                                                        if (offlineRecognizer5 != null) {
                                                                            offlineRecognizer5.release();
                                                                            g0Var10 = fl.g0.f38750a;
                                                                        } else {
                                                                            g0Var10 = null;
                                                                        }
                                                                        fl.r.b(g0Var10);
                                                                    } catch (Throwable th14) {
                                                                        fl.r.a aVar19 = fl.r.f38769b;
                                                                        fl.r.b(fl.s.a(th14));
                                                                    }
                                                                    return g0Var18;
                                                                }
                                                                boolean z14 = z13;
                                                                SpeechSegment speechSegmentFront = ((Vad) k0Var2.f43597a).front();
                                                                ((Vad) k0Var2.f43597a).pop();
                                                                i16++;
                                                                double length = d14 + (((double) speechSegmentFront.getSamples().length) / d11);
                                                                z13 = z14 || f0.f47576a.c((OfflineRecognizer) k0Var.f43597a, speechSegmentFront.getSamples(), ((double) speechSegmentFront.getStart()) / d11, arrayList2, z11 ^ true);
                                                                d14 = length;
                                                                z11 = true;
                                                            }
                                                            boolean z15 = z13;
                                                            double d15 = d14;
                                                            if (i16 == 0) {
                                                                wp.a.i("VAD found no speech (%.1fs clip) → window fallback", kotlin.coroutines.jvm.internal.b.b(d12));
                                                                int i17 = 448000;
                                                                float[] fArr3 = new float[448000];
                                                                aVar7.k();
                                                                int i18 = 0;
                                                                while (i18 < iD) {
                                                                    if (!p0.f(sVar)) {
                                                                        gm.u.f(sVar, null, 1, null);
                                                                        fl.g0 g0Var19 = fl.g0.f38750a;
                                                                        try {
                                                                            fl.r.a aVar20 = fl.r.f38769b;
                                                                            aVar7.close();
                                                                            fl.r.b(g0Var19);
                                                                        } catch (Throwable th15) {
                                                                            fl.r.a aVar21 = fl.r.f38769b;
                                                                            fl.r.b(fl.s.a(th15));
                                                                        }
                                                                        try {
                                                                            Vad vad6 = (Vad) k0Var2.f43597a;
                                                                            if (vad6 != null) {
                                                                                vad6.release();
                                                                                g0Var9 = fl.g0.f38750a;
                                                                            } else {
                                                                                g0Var9 = null;
                                                                            }
                                                                            fl.r.b(g0Var9);
                                                                        } catch (Throwable th16) {
                                                                            fl.r.a aVar22 = fl.r.f38769b;
                                                                            fl.r.b(fl.s.a(th16));
                                                                        }
                                                                        try {
                                                                            OfflineRecognizer offlineRecognizer6 = (OfflineRecognizer) k0Var.f43597a;
                                                                            if (offlineRecognizer6 != null) {
                                                                                offlineRecognizer6.release();
                                                                                g0Var8 = fl.g0.f38750a;
                                                                            } else {
                                                                                g0Var8 = null;
                                                                            }
                                                                            fl.r.b(g0Var8);
                                                                        } catch (Throwable th17) {
                                                                            fl.r.a aVar23 = fl.r.f38769b;
                                                                            fl.r.b(fl.s.a(th17));
                                                                        }
                                                                        return g0Var19;
                                                                    }
                                                                    int i19 = i17;
                                                                    int iH = aVar7.h(fArr3, i19);
                                                                    if (iH <= 0) {
                                                                        break;
                                                                    }
                                                                    if (iH == i19) {
                                                                        fArr = fArr3;
                                                                    } else {
                                                                        float[] fArrCopyOf = Arrays.copyOf(fArr3, iH);
                                                                        kotlin.jvm.internal.s.g(fArrCopyOf, "copyOf(...)");
                                                                        fArr = fArrCopyOf;
                                                                    }
                                                                    float[] fArr4 = fArr3;
                                                                    ArrayList arrayList3 = arrayList2;
                                                                    z15 = z15 || f0.f47576a.c((OfflineRecognizer) k0Var.f43597a, fArr, ((double) i18) / d11, arrayList2, false);
                                                                    i18 += iH;
                                                                    aVar2 = aVar7;
                                                                    double d16 = d12;
                                                                    try {
                                                                        sVar.e(new h0.d(yl.g.i((int) ((((long) i18) * 100) / ((long) iD)), 0, 100)));
                                                                        aVar7 = aVar2;
                                                                        arrayList2 = arrayList3;
                                                                        d12 = d16;
                                                                        i16 = i16;
                                                                        i17 = 448000;
                                                                        fArr3 = fArr4;
                                                                    } catch (Throwable th18) {
                                                                        th = th18;
                                                                        th2 = th;
                                                                        fl.r.a aVar24 = fl.r.f38769b;
                                                                        aVar2.close();
                                                                        fl.r.b(fl.g0.f38750a);
                                                                        throw th2;
                                                                    }
                                                                    th = th;
                                                                    Throwable th19 = th;
                                                                    wp.a.f(th19, "sherpa-onnx Whisper transcription failed", new Object[0]);
                                                                    fl.r.a aVar25 = fl.r.f38769b;
                                                                    com.google.firebase.crashlytics.a aVarB = com.google.firebase.crashlytics.a.b();
                                                                    aVarB.e("caption_failure_site", "sherpa_whisper_engine");
                                                                    aVarB.e("caption_exception_class", th19.getClass().getName());
                                                                    aVarB.d(th19);
                                                                    fl.r.b(aVarB);
                                                                    StringBuilder sb2 = new StringBuilder();
                                                                    sb2.append(th19.getClass().getSimpleName());
                                                                    sb2.append(": ");
                                                                    message = th19.getMessage();
                                                                    if (message == null) {
                                                                        message = str;
                                                                    }
                                                                    sb2.append(message);
                                                                    sVar.e(new h0.b(sb2.toString()));
                                                                    g0Var = null;
                                                                    gm.u.f(sVar, null, 1, null);
                                                                    vad = (Vad) k0Var2.f43597a;
                                                                    if (vad != null) {
                                                                        vad.release();
                                                                        g0Var5 = fl.g0.f38750a;
                                                                    } else {
                                                                        g0Var5 = null;
                                                                    }
                                                                    fl.r.b(g0Var5);
                                                                    offlineRecognizer = (OfflineRecognizer) k0Var.f43597a;
                                                                    if (offlineRecognizer != null) {
                                                                        offlineRecognizer.release();
                                                                        g0Var4 = fl.g0.f38750a;
                                                                    } else {
                                                                        g0Var4 = null;
                                                                    }
                                                                }
                                                                i10 = i16;
                                                                aVar3 = aVar7;
                                                                d10 = d12;
                                                                arrayList = arrayList2;
                                                                z10 = true;
                                                            } else {
                                                                i10 = i16;
                                                                aVar3 = aVar7;
                                                                d10 = d12;
                                                                arrayList = arrayList2;
                                                                z10 = false;
                                                            }
                                                            boolean z16 = z15;
                                                            try {
                                                                fl.r.a aVar26 = fl.r.f38769b;
                                                                aVar3.close();
                                                                fl.r.b(fl.g0.f38750a);
                                                            } catch (Throwable th20) {
                                                                fl.r.a aVar27 = fl.r.f38769b;
                                                                fl.r.b(fl.s.a(th20));
                                                            }
                                                            if (arrayList.size() > 1) {
                                                                gl.r.y(arrayList, new a());
                                                            }
                                                            StringBuilder sb3 = new StringBuilder();
                                                            sb3.append(z16 ? BidResponsed.KEY_TOKEN : "estimate");
                                                            sb3.append(z10 ? "+window" : str);
                                                            String string = sb3.toString();
                                                            wp.a.a("Whisper: %d words, ts_mode=%s (%d vad segs, %.1fs speech / %.1fs clip)", kotlin.coroutines.jvm.internal.b.d(arrayList.size()), string, kotlin.coroutines.jvm.internal.b.d(i10), kotlin.coroutines.jvm.internal.b.b(d15), kotlin.coroutines.jvm.internal.b.b(d10));
                                                            try {
                                                                com.google.firebase.crashlytics.a.b().e("caption_ts_mode", string);
                                                                fl.r.b(fl.g0.f38750a);
                                                            } catch (Throwable th21) {
                                                                fl.r.a aVar28 = fl.r.f38769b;
                                                                fl.r.b(fl.s.a(th21));
                                                            }
                                                            sVar.e(new h0.d(100));
                                                            sVar.e(new h0.a(gl.r.I0(arrayList)));
                                                            gm.u.f(sVar, null, 1, null);
                                                            try {
                                                                Vad vad7 = (Vad) k0Var2.f43597a;
                                                                if (vad7 != null) {
                                                                    vad7.release();
                                                                    g0Var7 = fl.g0.f38750a;
                                                                } else {
                                                                    g0Var7 = null;
                                                                }
                                                                fl.r.b(g0Var7);
                                                            } catch (Throwable th22) {
                                                                fl.r.a aVar29 = fl.r.f38769b;
                                                                fl.r.b(fl.s.a(th22));
                                                            }
                                                            OfflineRecognizer offlineRecognizer7 = (OfflineRecognizer) k0Var.f43597a;
                                                            if (offlineRecognizer7 == null) {
                                                                g0Var4 = null;
                                                                break;
                                                            }
                                                            offlineRecognizer7.release();
                                                            g0Var4 = fl.g0.f38750a;
                                                            break;
                                                        } catch (Throwable th23) {
                                                            th = th23;
                                                            aVar2 = aVar7;
                                                            th2 = th;
                                                            fl.r.a aVar210 = fl.r.f38769b;
                                                            aVar2.close();
                                                            fl.r.b(fl.g0.f38750a);
                                                            throw th2;
                                                        }
                                                    }
                                                    try {
                                                        ((Vad) k0Var2.f43597a).acceptWaveform(fArr2);
                                                        int i20 = i15 + i13;
                                                        boolean z17 = z12;
                                                        Throwable th24 = th3;
                                                        while (!((Vad) k0Var2.f43597a).empty()) {
                                                            if (!p0.f(sVar)) {
                                                                gm.u.f(sVar, th24, 1, th24);
                                                                fl.g0 g0Var20 = fl.g0.f38750a;
                                                                try {
                                                                    fl.r.a aVar30 = fl.r.f38769b;
                                                                    aVar7.close();
                                                                    fl.r.b(g0Var20);
                                                                } catch (Throwable th25) {
                                                                    fl.r.a aVar31 = fl.r.f38769b;
                                                                    fl.r.b(fl.s.a(th25));
                                                                }
                                                                try {
                                                                    Vad vad8 = (Vad) k0Var2.f43597a;
                                                                    if (vad8 != null) {
                                                                        vad8.release();
                                                                        obj3 = fl.g0.f38750a;
                                                                    } else {
                                                                        obj3 = th24;
                                                                    }
                                                                    fl.r.b(obj3);
                                                                } catch (Throwable th26) {
                                                                    fl.r.a aVar32 = fl.r.f38769b;
                                                                    fl.r.b(fl.s.a(th26));
                                                                }
                                                                try {
                                                                    OfflineRecognizer offlineRecognizer8 = (OfflineRecognizer) k0Var.f43597a;
                                                                    Object obj5 = th24;
                                                                    if (offlineRecognizer8 != null) {
                                                                        offlineRecognizer8.release();
                                                                        obj5 = fl.g0.f38750a;
                                                                    }
                                                                    fl.r.b(obj5);
                                                                } catch (Throwable th27) {
                                                                    fl.r.a aVar33 = fl.r.f38769b;
                                                                    fl.r.b(fl.s.a(th27));
                                                                }
                                                                return g0Var20;
                                                            }
                                                            SpeechSegment speechSegmentFront2 = ((Vad) k0Var2.f43597a).front();
                                                            ((Vad) k0Var2.f43597a).pop();
                                                            int i21 = i14 + 1;
                                                            str = str2;
                                                            try {
                                                                float[] fArr5 = fArr2;
                                                                double length2 = d13 + (((double) speechSegmentFront2.getSamples().length) / d11);
                                                                z17 = z17 || f0.f47576a.c((OfflineRecognizer) k0Var.f43597a, speechSegmentFront2.getSamples(), ((double) speechSegmentFront2.getStart()) / d11, arrayList2, z11 ^ true);
                                                                str2 = str;
                                                                fArr2 = fArr5;
                                                                i14 = i21;
                                                                d13 = length2;
                                                                th24 = null;
                                                                z11 = true;
                                                            } catch (Throwable th28) {
                                                                th = th28;
                                                            }
                                                            th2 = th;
                                                            aVar2 = aVar7;
                                                            try {
                                                                fl.r.a aVar211 = fl.r.f38769b;
                                                                aVar2.close();
                                                                fl.r.b(fl.g0.f38750a);
                                                                throw th2;
                                                            } catch (Throwable th29) {
                                                                fl.r.a aVar34 = fl.r.f38769b;
                                                                fl.r.b(fl.s.a(th29));
                                                                throw th2;
                                                            }
                                                        }
                                                        String str3 = str2;
                                                        float[] fArr6 = fArr2;
                                                        boolean z18 = z11;
                                                        sVar.e(new h0.d(yl.g.i((int) ((((long) i20) * 95) / ((long) iD)), 0, 95)));
                                                        i15 = i20;
                                                        z11 = z18;
                                                        z12 = z17;
                                                        str2 = str3;
                                                        fArr2 = fArr6;
                                                        i12 = 1;
                                                        th3 = null;
                                                        i13 = 512;
                                                    } catch (Throwable th30) {
                                                        th = th30;
                                                        str = str2;
                                                    }
                                                }
                                            } catch (Throwable th31) {
                                                th = th31;
                                                Throwable th110 = th;
                                                wp.a.f(th110, "sherpa-onnx Whisper transcription failed", new Object[0]);
                                                fl.r.a aVar212 = fl.r.f38769b;
                                                com.google.firebase.crashlytics.a aVarB2 = com.google.firebase.crashlytics.a.b();
                                                aVarB2.e("caption_failure_site", "sherpa_whisper_engine");
                                                aVarB2.e("caption_exception_class", th110.getClass().getName());
                                                aVarB2.d(th110);
                                                fl.r.b(aVarB2);
                                                StringBuilder sb4 = new StringBuilder();
                                                sb4.append(th110.getClass().getSimpleName());
                                                sb4.append(": ");
                                                message = th110.getMessage();
                                                if (message == null) {
                                                    message = str;
                                                }
                                                sb4.append(message);
                                                sVar.e(new h0.b(sb4.toString()));
                                                g0Var = null;
                                                gm.u.f(sVar, null, 1, null);
                                                vad = (Vad) k0Var2.f43597a;
                                                if (vad != null) {
                                                    vad.release();
                                                    g0Var5 = fl.g0.f38750a;
                                                } else {
                                                    g0Var5 = null;
                                                }
                                                fl.r.b(g0Var5);
                                                offlineRecognizer = (OfflineRecognizer) k0Var.f43597a;
                                                if (offlineRecognizer != null) {
                                                    offlineRecognizer.release();
                                                    g0Var4 = fl.g0.f38750a;
                                                } else {
                                                    g0Var4 = null;
                                                }
                                            }
                                            fl.r.b(g0Var4);
                                            aVar = new tl.a() { // from class: nf.g0
                                                @Override // tl.a
                                                public final Object invoke() {
                                                    return f0.b.q();
                                                }
                                            };
                                            this.f47580r = 1;
                                            if (gm.q.a(sVar, aVar, this) == objF) {
                                                return objF;
                                            }
                                        } catch (Throwable th32) {
                                            th = th32;
                                            str = "";
                                        }
                                        vad = (Vad) k0Var2.f43597a;
                                        if (vad != null) {
                                            vad.release();
                                            g0Var5 = fl.g0.f38750a;
                                        } else {
                                            g0Var5 = null;
                                        }
                                        fl.r.b(g0Var5);
                                    } catch (Throwable th33) {
                                        fl.r.a aVar35 = fl.r.f38769b;
                                        fl.r.b(fl.s.a(th33));
                                    }
                                    fl.r.a aVar213 = fl.r.f38769b;
                                    com.google.firebase.crashlytics.a aVarB3 = com.google.firebase.crashlytics.a.b();
                                    aVarB3.e("caption_failure_site", "sherpa_whisper_engine");
                                    aVarB3.e("caption_exception_class", th110.getClass().getName());
                                    aVarB3.d(th110);
                                    fl.r.b(aVarB3);
                                } catch (Throwable th34) {
                                    fl.r.a aVar36 = fl.r.f38769b;
                                    fl.r.b(fl.s.a(th34));
                                }
                                gm.u.f(sVar, null, 1, null);
                                offlineRecognizer = (OfflineRecognizer) k0Var.f43597a;
                                if (offlineRecognizer != null) {
                                    offlineRecognizer.release();
                                    g0Var4 = fl.g0.f38750a;
                                } else {
                                    g0Var4 = null;
                                }
                                fl.r.b(g0Var4);
                                aVar = new tl.a() { // from class: nf.g0
                                    @Override // tl.a
                                    public final Object invoke() {
                                        return f0.b.q();
                                    }
                                };
                                this.f47580r = 1;
                                if (gm.q.a(sVar, aVar, this) == objF) {
                                    return objF;
                                }
                            } catch (Throwable th35) {
                                th = th35;
                                Throwable th36 = th;
                                try {
                                    fl.r.a aVar37 = fl.r.f38769b;
                                    Vad vad9 = (Vad) k0Var2.f43597a;
                                    if (vad9 != null) {
                                        vad9.release();
                                        g0Var3 = fl.g0.f38750a;
                                    } else {
                                        g0Var3 = g0Var;
                                    }
                                    fl.r.b(g0Var3);
                                } catch (Throwable th37) {
                                    fl.r.a aVar38 = fl.r.f38769b;
                                    fl.r.b(fl.s.a(th37));
                                }
                                try {
                                    OfflineRecognizer offlineRecognizer9 = (OfflineRecognizer) k0Var.f43597a;
                                    if (offlineRecognizer9 != null) {
                                        offlineRecognizer9.release();
                                        g0Var2 = fl.g0.f38750a;
                                    } else {
                                        g0Var2 = g0Var;
                                    }
                                    fl.r.b(g0Var2);
                                    throw th36;
                                } catch (Throwable th38) {
                                    fl.r.a aVar39 = fl.r.f38769b;
                                    fl.r.b(fl.s.a(th38));
                                    throw th36;
                                }
                            }
                            wp.a.f(th110, "sherpa-onnx Whisper transcription failed", new Object[0]);
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(th110.getClass().getSimpleName());
                            sb5.append(": ");
                            message = th110.getMessage();
                            if (message == null) {
                                message = str;
                            }
                            sb5.append(message);
                            sVar.e(new h0.b(sb5.toString()));
                            g0Var = null;
                        } catch (Throwable th39) {
                            th = th39;
                            g0Var = null;
                        }
                        th = th;
                        str = str2;
                        Throwable th111 = th;
                    } catch (Throwable th40) {
                        fl.r.a aVar40 = fl.r.f38769b;
                        fl.r.b(fl.s.a(th40));
                    }
                } catch (Throwable th41) {
                    th = th41;
                    str = str2;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
            return fl.g0.f38750a;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(gm.s sVar, kl.f fVar) {
            return ((b) create(sVar, fVar)).invokeSuspend(fl.g0.f38750a);
        }
    }

    private f0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean c(OfflineRecognizer offlineRecognizer, float[] fArr, double d10, List list, boolean z10) {
        boolean z11 = false;
        if (fArr.length == 0) {
            return false;
        }
        OfflineStream offlineStreamCreateStream = offlineRecognizer.createStream();
        try {
            offlineStreamCreateStream.acceptWaveform(fArr, 16000);
            offlineRecognizer.decode(offlineStreamCreateStream);
            OfflineRecognizerResult result = offlineRecognizer.getResult(offlineStreamCreateStream);
            int length = result.getTokens().length;
            boolean z12 = length > 0 && result.getTimestamps().length == length && result.getDurations().length == length;
            if (z10) {
                wp.a.a("decode@%.1fs haveTokenTs=%b tokens=%d ts=%d dur=%d text=%s", Double.valueOf(d10), Boolean.valueOf(z12), Integer.valueOf(length), Integer.valueOf(result.getTimestamps().length), Integer.valueOf(result.getDurations().length), bm.r.e1(result.getText(), AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL));
                if (length > 0) {
                    wp.a.a("tokens0: %s", gl.r.l0(gl.j.q0(result.getTokens(), 30), "|", null, null, 0, null, null, 62, null));
                }
            }
            if (z12) {
                gl.r.z(list, i0.f47596a.c(result.getTokens(), result.getTimestamps(), result.getDurations(), d10));
                z11 = true;
            } else {
                gl.r.z(list, i0.f47596a.b(result.getText(), d10, d10 + (((double) fArr.length) / ((double) 16000))));
            }
            try {
                return z11;
            } catch (Throwable th2) {
                return z11;
            }
        } finally {
            try {
                fl.r.a aVar = fl.r.f38769b;
                offlineStreamCreateStream.release();
                fl.r.b(fl.g0.f38750a);
            } catch (Throwable th3) {
                fl.r.a aVar2 = fl.r.f38769b;
                fl.r.b(fl.s.a(th3));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int d() {
        return yl.g.i(Runtime.getRuntime().availableProcessors(), 2, 4);
    }

    public final hm.e e(File encoder, File decoder, File tokens, File vadModel, File wavFile, String lang) {
        kotlin.jvm.internal.s.h(encoder, "encoder");
        kotlin.jvm.internal.s.h(decoder, "decoder");
        kotlin.jvm.internal.s.h(tokens, "tokens");
        kotlin.jvm.internal.s.h(vadModel, "vadModel");
        kotlin.jvm.internal.s.h(wavFile, "wavFile");
        kotlin.jvm.internal.s.h(lang, "lang");
        return hm.g.u(hm.g.d(new b(encoder, decoder, lang, tokens, vadModel, wavFile, null)), c1.b());
    }
}
