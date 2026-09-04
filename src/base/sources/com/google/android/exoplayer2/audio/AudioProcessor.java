package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface AudioProcessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f16452a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class UnhandledAudioFormatException extends Exception {
        public UnhandledAudioFormatException(a aVar) {
            this("Unhandled input format:", aVar);
        }

        public UnhandledAudioFormatException(String str, a aVar) {
            super(str + " " + aVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f16453e = new a(-1, -1, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f16454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f16455b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f16456c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f16457d;

        public a(int i10, int i11, int i12) {
            this.f16454a = i10;
            this.f16455b = i11;
            this.f16456c = i12;
            this.f16457d = r0.B0(i12) ? r0.h0(i12, i11) : -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f16454a == aVar.f16454a && this.f16455b == aVar.f16455b && this.f16456c == aVar.f16456c;
        }

        public int hashCode() {
            return sc.l.b(Integer.valueOf(this.f16454a), Integer.valueOf(this.f16455b), Integer.valueOf(this.f16456c));
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f16454a + ", channelCount=" + this.f16455b + ", encoding=" + this.f16456c + ']';
        }
    }

    a a(a aVar);

    void flush();

    ByteBuffer getOutput();

    boolean isActive();

    boolean isEnded();

    void queueEndOfStream();

    void queueInput(ByteBuffer byteBuffer);

    void reset();
}
