package o9;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.b2;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class d implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f48278a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f48282e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f48284g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f48285h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f48286i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.exoplayer2.mediacodec.h f48279b = new com.google.android.exoplayer2.mediacodec.h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f48280c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f48281d = 5000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.exoplayer2.mediacodec.l f48283f = com.google.android.exoplayer2.mediacodec.l.f17304a;

    public d(Context context) {
        this.f48278a = context;
    }

    @Override // o9.i0
    public b2[] a(Handler handler, pb.x xVar, com.google.android.exoplayer2.audio.e eVar, bb.o oVar, ha.e eVar2) {
        Handler handler2;
        ArrayList arrayList = new ArrayList();
        h(this.f48278a, this.f48280c, this.f48283f, this.f48282e, handler, xVar, this.f48281d, arrayList);
        AudioSink audioSinkC = c(this.f48278a, this.f48284g, this.f48285h, this.f48286i);
        if (audioSinkC != null) {
            handler2 = handler;
            b(this.f48278a, this.f48280c, this.f48283f, this.f48282e, audioSinkC, handler2, eVar, arrayList);
        } else {
            handler2 = handler;
        }
        g(this.f48278a, oVar, handler2.getLooper(), this.f48280c, arrayList);
        e(this.f48278a, eVar2, handler2.getLooper(), this.f48280c, arrayList);
        d(this.f48278a, this.f48280c, arrayList);
        f(this.f48278a, handler2, this.f48280c, arrayList);
        return (b2[]) arrayList.toArray(new b2[0]);
    }

    protected void b(Context context, int i10, com.google.android.exoplayer2.mediacodec.l lVar, boolean z10, AudioSink audioSink, Handler handler, com.google.android.exoplayer2.audio.e eVar, ArrayList arrayList) {
        int i11;
        int i12;
        int i13;
        arrayList.add(new com.google.android.exoplayer2.audio.k(context, i(), lVar, z10, handler, eVar, audioSink));
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
                    arrayList.add(size, (b2) Class.forName("com.google.android.exoplayer2.decoder.midi.MidiRenderer").getConstructor(null).newInstance(null));
                    ob.u.f("DefaultRenderersFactory", "Loaded MidiRenderer.");
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
                        arrayList.add(i11, (b2) Class.forName("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, com.google.android.exoplayer2.audio.e.class, AudioSink.class).newInstance(handler, eVar, audioSink));
                        ob.u.f("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                    } catch (ClassNotFoundException unused3) {
                        i11 = i12;
                        i12 = i11;
                    }
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating Opus extension", e10);
                }
            } catch (ClassNotFoundException unused4) {
            }
            try {
                try {
                    i13 = i12 + 1;
                    try {
                        arrayList.add(i12, (b2) Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, com.google.android.exoplayer2.audio.e.class, AudioSink.class).newInstance(handler, eVar, audioSink));
                        ob.u.f("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                    } catch (ClassNotFoundException unused5) {
                        i12 = i13;
                        i13 = i12;
                    }
                } catch (Exception e11) {
                    throw new RuntimeException("Error instantiating FLAC extension", e11);
                }
            } catch (ClassNotFoundException unused6) {
            }
            try {
                arrayList.add(i13, (b2) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, com.google.android.exoplayer2.audio.e.class, AudioSink.class).newInstance(handler, eVar, audioSink));
                ob.u.f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
            } catch (ClassNotFoundException unused7) {
            } catch (Exception e12) {
                throw new RuntimeException("Error instantiating FFmpeg extension", e12);
            }
        } catch (Exception e13) {
            throw new RuntimeException("Error instantiating MIDI extension", e13);
        }
    }

    protected AudioSink c(Context context, boolean z10, boolean z11, boolean z12) {
        return new DefaultAudioSink.f(context).i(z10).h(z11).j(z12 ? 1 : 0).g();
    }

    protected void d(Context context, int i10, ArrayList arrayList) {
        arrayList.add(new qb.b());
    }

    protected void e(Context context, ha.e eVar, Looper looper, int i10, ArrayList arrayList) {
        arrayList.add(new ha.f(eVar, looper));
    }

    protected void g(Context context, bb.o oVar, Looper looper, int i10, ArrayList arrayList) {
        arrayList.add(new bb.p(oVar, looper));
    }

    protected void h(Context context, int i10, com.google.android.exoplayer2.mediacodec.l lVar, boolean z10, Handler handler, pb.x xVar, long j10, ArrayList arrayList) {
        String str;
        Integer num;
        int i11;
        Class cls = Integer.TYPE;
        Class cls2 = Long.TYPE;
        arrayList.add(new pb.g(context, i(), lVar, j10, z10, handler, xVar, 50));
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            try {
                Constructor<?> constructor = Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(cls2, Handler.class, pb.x.class, cls);
                num = 50;
                try {
                    i11 = size + 1;
                    try {
                        arrayList.add(size, (b2) constructor.newInstance(Long.valueOf(j10), handler, xVar, 50));
                        str = "DefaultRenderersFactory";
                        try {
                            ob.u.f(str, "Loaded LibvpxVideoRenderer.");
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
                arrayList.add(i11, (b2) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(cls2, Handler.class, pb.x.class, cls).newInstance(Long.valueOf(j10), handler, xVar, num));
                ob.u.f(str, "Loaded Libgav1VideoRenderer.");
            } catch (ClassNotFoundException unused5) {
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating AV1 extension", e10);
            }
        } catch (Exception e11) {
            throw new RuntimeException("Error instantiating VP9 extension", e11);
        }
    }

    protected com.google.android.exoplayer2.mediacodec.j.b i() {
        return this.f48279b;
    }

    protected void f(Context context, Handler handler, int i10, ArrayList arrayList) {
    }
}
