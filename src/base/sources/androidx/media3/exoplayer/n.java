package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import com.bytedance.sdk.openadsdk.core.bug.sk.hnj.UfZs.NhHRaDJCHtCTJR;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class n implements i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media3.exoplayer.mediacodec.g f5637b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f5640e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f5642g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f5643h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f5638c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f5639d = 5000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private androidx.media3.exoplayer.mediacodec.l f5641f = androidx.media3.exoplayer.mediacodec.l.f5629a;

    public n(Context context) {
        this.f5636a = context;
        this.f5637b = new androidx.media3.exoplayer.mediacodec.g(context);
    }

    @Override // androidx.media3.exoplayer.i2
    public f2[] a(Handler handler, androidx.media3.exoplayer.video.i iVar, androidx.media3.exoplayer.audio.e eVar, j2.h hVar, h2.b bVar) {
        Handler handler2;
        ArrayList arrayList = new ArrayList();
        i(this.f5636a, this.f5638c, this.f5641f, this.f5640e, handler, iVar, this.f5639d, arrayList);
        AudioSink audioSinkC = c(this.f5636a, this.f5642g, this.f5643h);
        if (audioSinkC != null) {
            handler2 = handler;
            b(this.f5636a, this.f5638c, this.f5641f, this.f5640e, audioSinkC, handler2, eVar, arrayList);
        } else {
            handler2 = handler;
        }
        h(this.f5636a, hVar, handler2.getLooper(), this.f5638c, arrayList);
        f(this.f5636a, bVar, handler2.getLooper(), this.f5638c, arrayList);
        d(this.f5636a, this.f5638c, arrayList);
        e(arrayList);
        g(this.f5636a, handler2, this.f5638c, arrayList);
        return (f2[]) arrayList.toArray(new f2[0]);
    }

    protected AudioSink c(Context context, boolean z10, boolean z11) {
        return new DefaultAudioSink.f(context).k(z10).j(z11).i();
    }

    protected void d(Context context, int i10, ArrayList arrayList) {
        arrayList.add(new n2.b());
    }

    protected void e(ArrayList arrayList) {
        arrayList.add(new f2.f(f2.c.a.f38222a, null));
    }

    protected void f(Context context, h2.b bVar, Looper looper, int i10, ArrayList arrayList) {
        arrayList.add(new h2.c(bVar, looper));
    }

    protected void g(Context context, Handler handler, int i10, ArrayList arrayList) {
    }

    protected void h(Context context, j2.h hVar, Looper looper, int i10, ArrayList arrayList) {
        arrayList.add(new j2.i(hVar, looper));
    }

    protected void i(Context context, int i10, androidx.media3.exoplayer.mediacodec.l lVar, boolean z10, Handler handler, androidx.media3.exoplayer.video.i iVar, long j10, ArrayList arrayList) {
        String str;
        Integer num;
        int i11;
        int i12;
        Class cls = Integer.TYPE;
        Class cls2 = Long.TYPE;
        arrayList.add(new androidx.media3.exoplayer.video.f(context, j(), lVar, j10, z10, handler, iVar, 50));
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            try {
                Constructor<?> constructor = Class.forName("androidx.media3.decoder.vp9.LibvpxVideoRenderer").getConstructor(cls2, Handler.class, androidx.media3.exoplayer.video.i.class, cls);
                num = 50;
                try {
                    i11 = size + 1;
                    try {
                        arrayList.add(size, (f2) constructor.newInstance(Long.valueOf(j10), handler, iVar, 50));
                        str = "DefaultRenderersFactory";
                        try {
                            w1.n.f(str, "Loaded LibvpxVideoRenderer.");
                        } catch (ClassNotFoundException unused) {
                            size = i11;
                            i11 = size;
                        }
                    } catch (ClassNotFoundException unused2) {
                        str = "DefaultRenderersFactory";
                    }
                } catch (ClassNotFoundException unused3) {
                    str = "DefaultRenderersFactory";
                }
            } catch (ClassNotFoundException unused4) {
                str = "DefaultRenderersFactory";
                num = 50;
            }
            try {
                try {
                    i12 = i11 + 1;
                    try {
                        arrayList.add(i11, (f2) Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(cls2, Handler.class, androidx.media3.exoplayer.video.i.class, cls).newInstance(Long.valueOf(j10), handler, iVar, num));
                        w1.n.f(str, "Loaded Libgav1VideoRenderer.");
                    } catch (ClassNotFoundException unused5) {
                        i11 = i12;
                        i12 = i11;
                    }
                } catch (ClassNotFoundException unused6) {
                }
                try {
                    arrayList.add(i12, (f2) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(cls2, Handler.class, androidx.media3.exoplayer.video.i.class, cls).newInstance(Long.valueOf(j10), handler, iVar, num));
                    w1.n.f(str, "Loaded FfmpegVideoRenderer.");
                } catch (ClassNotFoundException unused7) {
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating FFmpeg extension", e10);
                }
            } catch (Exception e11) {
                throw new RuntimeException("Error instantiating AV1 extension", e11);
            }
        } catch (Exception e12) {
            throw new RuntimeException("Error instantiating VP9 extension", e12);
        }
    }

    protected androidx.media3.exoplayer.mediacodec.h.b j() {
        return this.f5637b;
    }

    protected void b(Context context, int i10, androidx.media3.exoplayer.mediacodec.l lVar, boolean z10, AudioSink audioSink, Handler handler, androidx.media3.exoplayer.audio.e eVar, ArrayList arrayList) {
        int i11;
        int i12;
        int i13;
        arrayList.add(new androidx.media3.exoplayer.audio.l(context, j(), lVar, z10, handler, eVar, audioSink));
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            try {
                i11 = size + 1;
                try {
                    arrayList.add(size, (f2) Class.forName(NhHRaDJCHtCTJR.OWrvWV).getConstructor(Context.class).newInstance(context));
                    w1.n.f("DefaultRenderersFactory", "Loaded MidiRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i11;
                    i11 = size;
                }
            } catch (ClassNotFoundException unused2) {
            }
            try {
                try {
                    i12 = i11 + 1;
                    try {
                        arrayList.add(i11, (f2) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, androidx.media3.exoplayer.audio.e.class, AudioSink.class).newInstance(handler, eVar, audioSink));
                        w1.n.f("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                    } catch (ClassNotFoundException unused3) {
                        i11 = i12;
                        i12 = i11;
                    }
                } catch (ClassNotFoundException unused4) {
                }
                try {
                    try {
                        i13 = i12 + 1;
                        try {
                            arrayList.add(i12, (f2) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, androidx.media3.exoplayer.audio.e.class, AudioSink.class).newInstance(handler, eVar, audioSink));
                            w1.n.f("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                        } catch (ClassNotFoundException unused5) {
                            i12 = i13;
                            i13 = i12;
                        }
                    } catch (ClassNotFoundException unused6) {
                    }
                    try {
                        arrayList.add(i13, (f2) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, androidx.media3.exoplayer.audio.e.class, AudioSink.class).newInstance(handler, eVar, audioSink));
                        w1.n.f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                    } catch (ClassNotFoundException unused7) {
                    } catch (Exception e10) {
                        throw new RuntimeException("Error instantiating FFmpeg extension", e10);
                    }
                } catch (Exception e11) {
                    throw new RuntimeException("Error instantiating FLAC extension", e11);
                }
            } catch (Exception e12) {
                throw new RuntimeException("Error instantiating Opus extension", e12);
            }
        } catch (Exception e13) {
            throw new RuntimeException("Error instantiating MIDI extension", e13);
        }
    }
}
