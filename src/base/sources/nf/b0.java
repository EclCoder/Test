package nf;

import android.content.Context;
import em.c1;
import em.o0;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.j0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f47546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final of.e f47547b;

    public b0(Context context, of.e modelManager) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(modelManager, "modelManager");
        this.f47546a = context;
        this.f47547b = modelManager;
    }

    public final hm.e c(String inputPath, long j10, String lang) {
        kotlin.jvm.internal.s.h(inputPath, "inputPath");
        kotlin.jvm.internal.s.h(lang, "lang");
        return hm.g.u(hm.g.d(new a(lang, inputPath, j10, null)), c1.b());
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f47548r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f47549s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ String f47551u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ String f47552v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ long f47553w;

        /* JADX INFO: renamed from: nf.b0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class C0730a extends kotlin.coroutines.jvm.internal.m implements tl.o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f47554r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ File f47555s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ gm.s f47556t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ File f47557u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ File f47558v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ File f47559w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            final /* synthetic */ File f47560x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            final /* synthetic */ String f47561y;

            /* JADX INFO: renamed from: nf.b0$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
            static final class C0731a implements hm.f {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ gm.s f47562a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ File f47563b;

                C0731a(gm.s sVar, File file) {
                    this.f47562a = sVar;
                    this.f47563b = file;
                }

                @Override // hm.f
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(h0 h0Var, kl.f fVar) {
                    if (kotlin.jvm.internal.s.c(h0Var, h0.c.f47593a)) {
                        gm.k.b(this.f47562a.e(s.d.f47629a));
                    } else if (h0Var instanceof h0.d) {
                        gm.k.b(this.f47562a.e(new s.f(((h0.d) h0Var).a())));
                    } else if (h0Var instanceof h0.a) {
                        this.f47563b.delete();
                        this.f47562a.e(new s.a(((h0.a) h0Var).a()));
                        kotlin.coroutines.jvm.internal.b.a(gm.u.f(this.f47562a, null, 1, null));
                    } else {
                        if (!(h0Var instanceof h0.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f47563b.delete();
                        this.f47562a.e(new s.c(p.ENGINE, ((h0.b) h0Var).a()));
                        kotlin.coroutines.jvm.internal.b.a(gm.u.f(this.f47562a, null, 1, null));
                    }
                    return fl.g0.f38750a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0730a(File file, gm.s sVar, File file2, File file3, File file4, File file5, String str, kl.f fVar) {
                super(2, fVar);
                this.f47555s = file;
                this.f47556t = sVar;
                this.f47557u = file2;
                this.f47558v = file3;
                this.f47559w = file4;
                this.f47560x = file5;
                this.f47561y = str;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, kl.f fVar) {
                return ((C0730a) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                return new C0730a(this.f47555s, this.f47556t, this.f47557u, this.f47558v, this.f47559w, this.f47560x, this.f47561y, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = ll.b.f();
                int i10 = this.f47554r;
                if (i10 == 0) {
                    fl.s.b(obj);
                    if (!this.f47555s.exists() || this.f47555s.length() <= 44) {
                        this.f47556t.e(s.e.f47630a);
                        gm.u.f(this.f47556t, null, 1, null);
                        return fl.g0.f38750a;
                    }
                    hm.e eVarE = f0.f47576a.e(this.f47557u, this.f47558v, this.f47559w, this.f47560x, this.f47555s, this.f47561y);
                    C0731a c0731a = new C0731a(this.f47556t, this.f47555s);
                    this.f47554r = 1;
                    if (eVarE.collect(c0731a, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fl.s.b(obj);
                }
                return fl.g0.f38750a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, String str2, long j10, kl.f fVar) {
            super(2, fVar);
            this.f47551u = str;
            this.f47552v = str2;
            this.f47553w = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void r(j0 j0Var, gm.s sVar, File file, File file2, File file3, File file4, File file5, String str, com.arthenica.ffmpegkit.e eVar) {
            j0Var.f43595a = eVar.getSessionId();
            com.arthenica.ffmpegkit.m mVarO = eVar.o();
            if (com.arthenica.ffmpegkit.m.c(mVarO)) {
                em.k.d(sVar, null, null, new C0730a(file, sVar, file2, file3, file4, file5, str, null), 3, null);
                return;
            }
            if (com.arthenica.ffmpegkit.m.b(mVarO)) {
                file.delete();
                gm.u.f(sVar, null, 1, null);
            } else {
                wp.a.i("FFmpeg audio extract failed rc=%s logs=%s", mVarO, eVar.e());
                file.delete();
                sVar.e(new s.c(p.AUDIO_EXTRACT, null, 2, null));
                gm.u.f(sVar, null, 1, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void t(long j10, gm.s sVar, com.arthenica.ffmpegkit.p pVar) {
            if (j10 > 0) {
                sVar.e(new s.b(yl.g.i((int) ((pVar.a() * 100) / j10), 0, 100)));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fl.g0 w(gm.s sVar, File file, j0 j0Var) {
            try {
                fl.r.a aVar = fl.r.f38769b;
                com.arthenica.ffmpegkit.d.b(j0Var.f43595a);
                fl.r.b(fl.g0.f38750a);
            } catch (Throwable th2) {
                fl.r.a aVar2 = fl.r.f38769b;
                fl.r.b(fl.s.a(th2));
            }
            if (file.exists()) {
                try {
                    fl.r.b(Boolean.valueOf(file.delete()));
                } catch (Throwable th3) {
                    fl.r.a aVar3 = fl.r.f38769b;
                    fl.r.b(fl.s.a(th3));
                }
            }
            return fl.g0.f38750a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            a aVar = b0.this.new a(this.f47551u, this.f47552v, this.f47553w, fVar);
            aVar.f47549s = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f47548r;
            if (i10 == 0) {
                fl.s.b(obj);
                final gm.s sVar = (gm.s) this.f47549s;
                fl.v vVarK = b0.this.f47547b.k(of.f.f48559a.a());
                if (vVarK == null) {
                    sVar.e(new s.c(p.MODEL_MISSING, null, 2, null));
                    gm.u.f(sVar, null, 1, null);
                    return fl.g0.f38750a;
                }
                final File file = (File) vVarK.d();
                final File file2 = (File) vVarK.g();
                final File file3 = (File) vVarK.h();
                try {
                    final File fileL = b0.this.f47547b.l();
                    final File file4 = new File(b0.this.f47546a.getCacheDir(), "caption_audio_" + this.f47551u + ".wav");
                    if (file4.exists()) {
                        file4.delete();
                    }
                    String str = "-y -i \"" + this.f47552v + "\" -vn -af \"loudnorm=I=-16:LRA=11:TP=-1.5,highpass=f=80\" -acodec pcm_s16le -ar 16000 -ac 1 \"" + file4.getAbsolutePath() + "\"";
                    wp.a.a("Caption FFmpeg cmd: %s", str);
                    sVar.e(new s.b(0));
                    final j0 j0Var = new j0();
                    final String str2 = this.f47551u;
                    com.arthenica.ffmpegkit.f fVar = new com.arthenica.ffmpegkit.f() { // from class: nf.x
                        @Override // com.arthenica.ffmpegkit.f
                        public final void a(com.arthenica.ffmpegkit.e eVar) {
                            b0.a.r(j0Var, sVar, file4, file, file2, file3, fileL, str2, eVar);
                        }
                    };
                    com.arthenica.ffmpegkit.i iVar = new com.arthenica.ffmpegkit.i() { // from class: nf.y
                        @Override // com.arthenica.ffmpegkit.i
                        public final void a(com.arthenica.ffmpegkit.h hVar) {
                            b0.a.s(hVar);
                        }
                    };
                    final long j10 = this.f47553w;
                    j0Var.f43595a = com.arthenica.ffmpegkit.d.c(str, fVar, iVar, new com.arthenica.ffmpegkit.q() { // from class: nf.z
                        @Override // com.arthenica.ffmpegkit.q
                        public final void a(com.arthenica.ffmpegkit.p pVar) {
                            b0.a.t(j10, sVar, pVar);
                        }
                    }).getSessionId();
                    tl.a aVar = new tl.a() { // from class: nf.a0
                        @Override // tl.a
                        public final Object invoke() {
                            return b0.a.w(sVar, file4, j0Var);
                        }
                    };
                    this.f47548r = 1;
                    if (gm.q.a(sVar, aVar, this) == objF) {
                        return objF;
                    }
                } catch (Throwable th2) {
                    wp.a.f(th2, "VAD model unavailable", new Object[0]);
                    sVar.e(new s.c(p.ENGINE, null, 2, null));
                    gm.u.f(sVar, null, 1, null);
                    return fl.g0.f38750a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
            return fl.g0.f38750a;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(gm.s sVar, kl.f fVar) {
            return ((a) create(sVar, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void s(com.arthenica.ffmpegkit.h hVar) {
        }
    }
}
