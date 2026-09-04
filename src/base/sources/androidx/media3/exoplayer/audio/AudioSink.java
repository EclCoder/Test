package androidx.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import c2.x1;
import java.nio.ByteBuffer;
import t1.o;
import t1.w;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface AudioSink {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class InitializationException extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f4894b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o f4895c;

        public InitializationException(int i10, int i11, int i12, int i13, o oVar, boolean z10, Exception exc) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AudioTrack init failed ");
            sb2.append(i10);
            sb2.append(" ");
            sb2.append("Config(");
            sb2.append(i11);
            sb2.append(", ");
            sb2.append(i12);
            sb2.append(", ");
            sb2.append(i13);
            sb2.append(")");
            sb2.append(" ");
            sb2.append(oVar);
            sb2.append(z10 ? " (recoverable)" : "");
            super(sb2.toString(), exc);
            this.f4893a = i10;
            this.f4894b = z10;
            this.f4895c = oVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class UnexpectedDiscontinuityException extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f4896a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f4897b;

        public UnexpectedDiscontinuityException(long j10, long j11) {
            super("Unexpected audio track timestamp discontinuity: expected " + j11 + ", got " + j10);
            this.f4896a = j10;
            this.f4897b = j11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class WriteException extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f4899b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o f4900c;

        public WriteException(int i10, o oVar, boolean z10) {
            super("AudioTrack write failed: " + i10);
            this.f4899b = z10;
            this.f4898a = i10;
            this.f4900c = oVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f4902b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f4903c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f4904d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f4905e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f4906f;

        public a(int i10, int i11, int i12, boolean z10, boolean z11, int i13) {
            this.f4901a = i10;
            this.f4902b = i11;
            this.f4903c = i12;
            this.f4904d = z10;
            this.f4905e = z11;
            this.f4906f = i13;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a(Exception exc);

        void b(long j10);

        void c();

        void d();

        void e();

        void f();

        void j(a aVar);

        void k(a aVar);

        void onPositionDiscontinuity();

        void onSkipSilenceEnabledChanged(boolean z10);

        void onUnderrun(int i10, long j10, long j11);
    }

    boolean a(o oVar);

    boolean c(ByteBuffer byteBuffer, long j10, int i10);

    void disableTunneling();

    void e();

    void f(boolean z10);

    void flush();

    void g(w1.d dVar);

    long getCurrentPositionUs(boolean z10);

    w getPlaybackParameters();

    void h(b bVar);

    void handleDiscontinuity();

    boolean hasPendingData();

    void i(w wVar);

    boolean isEnded();

    void j(int i10);

    int k(o oVar);

    void l(x1 x1Var);

    void m(int i10, int i11);

    d n(o oVar);

    void o(t1.b bVar);

    void p(t1.c cVar);

    void pause();

    void play();

    void playToEndOfStream();

    void q(o oVar, int i10, int[] iArr);

    void release();

    void reset();

    void setAudioSessionId(int i10);

    void setPreferredDevice(AudioDeviceInfo audioDeviceInfo);

    void setVolume(float f10);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class ConfigurationException extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f4892a;

        public ConfigurationException(Throwable th2, o oVar) {
            super(th2);
            this.f4892a = oVar;
        }

        public ConfigurationException(String str, o oVar) {
            super(str);
            this.f4892a = oVar;
        }
    }

    default void d(long j10) {
    }
}
