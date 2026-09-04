package androidx.media3.common.audio;

import com.google.common.collect.c0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f4630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f4631b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ByteBuffer[] f4632c = new ByteBuffer[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AudioProcessor.a f4633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AudioProcessor.a f4634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f4635f;

    public a(c0 c0Var) {
        this.f4630a = c0Var;
        AudioProcessor.a aVar = AudioProcessor.a.f4625e;
        this.f4633d = aVar;
        this.f4634e = aVar;
        this.f4635f = false;
    }

    private int c() {
        return this.f4632c.length - 1;
    }

    private void g(ByteBuffer byteBuffer) {
        boolean z10;
        for (boolean z11 = true; z11; z11 = z10) {
            z10 = false;
            for (int i10 = 0; i10 <= c(); i10++) {
                if (!this.f4632c[i10].hasRemaining()) {
                    AudioProcessor audioProcessor = (AudioProcessor) this.f4631b.get(i10);
                    if (!audioProcessor.isEnded()) {
                        ByteBuffer byteBuffer2 = i10 > 0 ? this.f4632c[i10 - 1] : byteBuffer.hasRemaining() ? byteBuffer : AudioProcessor.f4623a;
                        long jRemaining = byteBuffer2.remaining();
                        audioProcessor.queueInput(byteBuffer2);
                        this.f4632c[i10] = audioProcessor.getOutput();
                        z10 |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f4632c[i10].hasRemaining();
                    } else if (!this.f4632c[i10].hasRemaining() && i10 < c()) {
                        ((AudioProcessor) this.f4631b.get(i10 + 1)).queueEndOfStream();
                    }
                }
            }
        }
    }

    public AudioProcessor.a a(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.equals(AudioProcessor.a.f4625e)) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        for (int i10 = 0; i10 < this.f4630a.size(); i10++) {
            AudioProcessor audioProcessor = (AudioProcessor) this.f4630a.get(i10);
            AudioProcessor.a aVarA = audioProcessor.a(aVar);
            if (audioProcessor.isActive()) {
                w1.a.g(!aVarA.equals(AudioProcessor.a.f4625e));
                aVar = aVarA;
            }
        }
        this.f4634e = aVar;
        return aVar;
    }

    public void b() {
        this.f4631b.clear();
        this.f4633d = this.f4634e;
        this.f4635f = false;
        for (int i10 = 0; i10 < this.f4630a.size(); i10++) {
            AudioProcessor audioProcessor = (AudioProcessor) this.f4630a.get(i10);
            audioProcessor.flush();
            if (audioProcessor.isActive()) {
                this.f4631b.add(audioProcessor);
            }
        }
        this.f4632c = new ByteBuffer[this.f4631b.size()];
        for (int i11 = 0; i11 <= c(); i11++) {
            this.f4632c[i11] = ((AudioProcessor) this.f4631b.get(i11)).getOutput();
        }
    }

    public ByteBuffer d() {
        if (!f()) {
            return AudioProcessor.f4623a;
        }
        ByteBuffer byteBuffer = this.f4632c[c()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        g(AudioProcessor.f4623a);
        return this.f4632c[c()];
    }

    public boolean e() {
        return this.f4635f && ((AudioProcessor) this.f4631b.get(c())).isEnded() && !this.f4632c[c()].hasRemaining();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f4630a.size() != aVar.f4630a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f4630a.size(); i10++) {
            if (this.f4630a.get(i10) != aVar.f4630a.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean f() {
        return !this.f4631b.isEmpty();
    }

    public void h() {
        if (!f() || this.f4635f) {
            return;
        }
        this.f4635f = true;
        ((AudioProcessor) this.f4631b.get(0)).queueEndOfStream();
    }

    public int hashCode() {
        return this.f4630a.hashCode();
    }

    public void i(ByteBuffer byteBuffer) {
        if (!f() || this.f4635f) {
            return;
        }
        g(byteBuffer);
    }

    public void j() {
        for (int i10 = 0; i10 < this.f4630a.size(); i10++) {
            AudioProcessor audioProcessor = (AudioProcessor) this.f4630a.get(i10);
            audioProcessor.flush();
            audioProcessor.reset();
        }
        this.f4632c = new ByteBuffer[0];
        AudioProcessor.a aVar = AudioProcessor.a.f4625e;
        this.f4633d = aVar;
        this.f4634e = aVar;
        this.f4635f = false;
    }
}
