package androidx.media3.common.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import sc.l;
import t1.o;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface AudioProcessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f4623a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class UnhandledAudioFormatException extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f4624a;

        public UnhandledAudioFormatException(a aVar) {
            this("Unhandled input format:", aVar);
        }

        public UnhandledAudioFormatException(String str, a aVar) {
            super(str + " " + aVar);
            this.f4624a = aVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f4625e = new a(-1, -1, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f4627b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f4628c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f4629d;

        public a(o oVar) {
            this(oVar.C, oVar.B, oVar.D);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f4626a == aVar.f4626a && this.f4627b == aVar.f4627b && this.f4628c == aVar.f4628c;
        }

        public int hashCode() {
            return l.b(Integer.valueOf(this.f4626a), Integer.valueOf(this.f4627b), Integer.valueOf(this.f4628c));
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f4626a + ", channelCount=" + this.f4627b + ", encoding=" + this.f4628c + ']';
        }

        public a(int i10, int i11, int i12) {
            this.f4626a = i10;
            this.f4627b = i11;
            this.f4628c = i12;
            this.f4629d = c0.w0(i12) ? c0.d0(i12, i11) : -1;
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
