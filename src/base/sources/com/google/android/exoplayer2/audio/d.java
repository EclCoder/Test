package com.google.android.exoplayer2.audio;

import com.google.common.collect.c0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f16577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f16578b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ByteBuffer[] f16579c = new ByteBuffer[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AudioProcessor.a f16580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AudioProcessor.a f16581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f16582f;

    public d(c0 c0Var) {
        this.f16577a = c0Var;
        AudioProcessor.a aVar = AudioProcessor.a.f16453e;
        this.f16580d = aVar;
        this.f16581e = aVar;
        this.f16582f = false;
    }

    private int c() {
        return this.f16579c.length - 1;
    }

    private void g(ByteBuffer byteBuffer) {
        boolean z10;
        for (boolean z11 = true; z11; z11 = z10) {
            z10 = false;
            for (int i10 = 0; i10 <= c(); i10++) {
                if (!this.f16579c[i10].hasRemaining()) {
                    AudioProcessor audioProcessor = (AudioProcessor) this.f16578b.get(i10);
                    if (!audioProcessor.isEnded()) {
                        ByteBuffer byteBuffer2 = i10 > 0 ? this.f16579c[i10 - 1] : byteBuffer.hasRemaining() ? byteBuffer : AudioProcessor.f16452a;
                        long jRemaining = byteBuffer2.remaining();
                        audioProcessor.queueInput(byteBuffer2);
                        this.f16579c[i10] = audioProcessor.getOutput();
                        z10 |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f16579c[i10].hasRemaining();
                    } else if (!this.f16579c[i10].hasRemaining() && i10 < c()) {
                        ((AudioProcessor) this.f16578b.get(i10 + 1)).queueEndOfStream();
                    }
                }
            }
        }
    }

    public AudioProcessor.a a(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.equals(AudioProcessor.a.f16453e)) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        for (int i10 = 0; i10 < this.f16577a.size(); i10++) {
            AudioProcessor audioProcessor = (AudioProcessor) this.f16577a.get(i10);
            AudioProcessor.a aVarA = audioProcessor.a(aVar);
            if (audioProcessor.isActive()) {
                ob.a.g(!aVarA.equals(AudioProcessor.a.f16453e));
                aVar = aVarA;
            }
        }
        this.f16581e = aVar;
        return aVar;
    }

    public void b() {
        this.f16578b.clear();
        this.f16580d = this.f16581e;
        this.f16582f = false;
        for (int i10 = 0; i10 < this.f16577a.size(); i10++) {
            AudioProcessor audioProcessor = (AudioProcessor) this.f16577a.get(i10);
            audioProcessor.flush();
            if (audioProcessor.isActive()) {
                this.f16578b.add(audioProcessor);
            }
        }
        this.f16579c = new ByteBuffer[this.f16578b.size()];
        for (int i11 = 0; i11 <= c(); i11++) {
            this.f16579c[i11] = ((AudioProcessor) this.f16578b.get(i11)).getOutput();
        }
    }

    public ByteBuffer d() {
        if (!f()) {
            return AudioProcessor.f16452a;
        }
        ByteBuffer byteBuffer = this.f16579c[c()];
        if (!byteBuffer.hasRemaining()) {
            g(AudioProcessor.f16452a);
        }
        return byteBuffer;
    }

    public boolean e() {
        return this.f16582f && ((AudioProcessor) this.f16578b.get(c())).isEnded() && !this.f16579c[c()].hasRemaining();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f16577a.size() != dVar.f16577a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f16577a.size(); i10++) {
            if (this.f16577a.get(i10) != dVar.f16577a.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean f() {
        return !this.f16578b.isEmpty();
    }

    public void h() {
        if (!f() || this.f16582f) {
            return;
        }
        this.f16582f = true;
        ((AudioProcessor) this.f16578b.get(0)).queueEndOfStream();
    }

    public int hashCode() {
        return this.f16577a.hashCode();
    }

    public void i(ByteBuffer byteBuffer) {
        if (!f() || this.f16582f) {
            return;
        }
        g(byteBuffer);
    }

    public void j() {
        for (int i10 = 0; i10 < this.f16577a.size(); i10++) {
            AudioProcessor audioProcessor = (AudioProcessor) this.f16577a.get(i10);
            audioProcessor.flush();
            audioProcessor.reset();
        }
        this.f16579c = new ByteBuffer[0];
        AudioProcessor.a aVar = AudioProcessor.a.f16453e;
        this.f16580d = aVar;
        this.f16581e = aVar;
        this.f16582f = false;
    }
}
