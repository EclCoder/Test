package androidx.media;

import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f4604a = versionedParcel.p(audioAttributesImplBase.f4604a, 1);
        audioAttributesImplBase.f4605b = versionedParcel.p(audioAttributesImplBase.f4605b, 2);
        audioAttributesImplBase.f4606c = versionedParcel.p(audioAttributesImplBase.f4606c, 3);
        audioAttributesImplBase.f4607d = versionedParcel.p(audioAttributesImplBase.f4607d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.x(false, false);
        versionedParcel.F(audioAttributesImplBase.f4604a, 1);
        versionedParcel.F(audioAttributesImplBase.f4605b, 2);
        versionedParcel.F(audioAttributesImplBase.f4606c, 3);
        versionedParcel.F(audioAttributesImplBase.f4607d, 4);
    }
}
