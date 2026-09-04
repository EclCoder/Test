package android.support.v4.media;

import androidx.media.AudioAttributesImplBase;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer extends androidx.media.AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        return androidx.media.AudioAttributesImplBaseParcelizer.read(versionedParcel);
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        androidx.media.AudioAttributesImplBaseParcelizer.write(audioAttributesImplBase, versionedParcel);
    }
}
