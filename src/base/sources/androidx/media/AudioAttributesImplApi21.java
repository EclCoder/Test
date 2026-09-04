package androidx.media;

import android.media.AudioAttributes;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioAttributes f4602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4603b = -1;

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f4602a.equals(((AudioAttributesImplApi21) obj).f4602a);
        }
        return false;
    }

    public int hashCode() {
        return this.f4602a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f4602a;
    }
}
