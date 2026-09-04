package com.googlecode.mp4parser.authoring.tracks;

import com.googlecode.mp4parser.authoring.Track;
import hi.a;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface CencEncryptedTrack extends Track {
    UUID getDefaultKeyId();

    List<a> getSampleEncryptionEntries();

    boolean hasSubSampleEncryption();
}
