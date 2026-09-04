package com.google.android.exoplayer2.audio;

import android.media.AudioDeviceInfo;
import com.google.android.exoplayer2.v0;
import com.google.android.exoplayer2.w1;
import java.nio.ByteBuffer;
import p9.s1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface AudioSink {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class InitializationException extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f16459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f16460b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final v0 f16461c;

        public InitializationException(int i10, int i11, int i12, int i13, v0 v0Var, boolean z10, Exception exc) {
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
            sb2.append(v0Var);
            sb2.append(z10 ? " (recoverable)" : "");
            super(sb2.toString(), exc);
            this.f16459a = i10;
            this.f16460b = z10;
            this.f16461c = v0Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class UnexpectedDiscontinuityException extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f16462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f16463b;

        public UnexpectedDiscontinuityException(long j10, long j11) {
            super("Unexpected audio track timestamp discontinuity: expected " + j11 + ", got " + j10);
            this.f16462a = j10;
            this.f16463b = j11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class WriteException extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f16464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f16465b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final v0 f16466c;

        public WriteException(int i10, v0 v0Var, boolean z10) {
            super("AudioTrack write failed: " + i10);
            this.f16465b = z10;
            this.f16464a = i10;
            this.f16466c = v0Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void a(Exception exc);

        void b(long j10);

        void c();

        void d();

        void e();

        void onPositionDiscontinuity();

        void onSkipSilenceEnabledChanged(boolean z10);

        void onUnderrun(int i10, long j10, long j11);
    }

    boolean a(v0 v0Var);

    void b(w1 w1Var);

    boolean c(ByteBuffer byteBuffer, long j10, int i10);

    void disableTunneling();

    void e();

    void f(boolean z10);

    void flush();

    void g(com.google.android.exoplayer2.audio.a aVar);

    long getCurrentPositionUs(boolean z10);

    w1 getPlaybackParameters();

    void h(a aVar);

    void handleDiscontinuity();

    boolean hasPendingData();

    int i(v0 v0Var);

    boolean isEnded();

    void j();

    void k(s1 s1Var);

    void l(v0 v0Var, int i10, int[] iArr);

    void m(q9.p pVar);

    void pause();

    void play();

    void playToEndOfStream();

    void release();

    void reset();

    void setAudioSessionId(int i10);

    void setPreferredDevice(AudioDeviceInfo audioDeviceInfo);

    void setVolume(float f10);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class ConfigurationException extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v0 f16458a;

        public ConfigurationException(Throwable th2, v0 v0Var) {
            super(th2);
            this.f16458a = v0Var;
        }

        public ConfigurationException(String str, v0 v0Var) {
            super(str);
            this.f16458a = v0Var;
        }
    }

    default void d(long j10) {
    }
}
