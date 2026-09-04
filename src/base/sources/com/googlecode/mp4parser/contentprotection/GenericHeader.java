package com.googlecode.mp4parser.contentprotection;

import com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader;
import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class GenericHeader extends ProtectionSpecificHeader {
    public static UUID PROTECTION_SYSTEM_ID;
    ByteBuffer data;

    static {
        UUID uuidFromString = UUID.fromString("00000000-0000-0000-0000-000000000000");
        PROTECTION_SYSTEM_ID = uuidFromString;
        ProtectionSpecificHeader.uuidRegistry.put(uuidFromString, GenericHeader.class);
    }

    @Override // com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader
    public ByteBuffer getData() {
        return this.data;
    }

    @Override // com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader
    public UUID getSystemId() {
        return PROTECTION_SYSTEM_ID;
    }

    @Override // com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader
    public void parse(ByteBuffer byteBuffer) {
        this.data = byteBuffer;
    }
}
