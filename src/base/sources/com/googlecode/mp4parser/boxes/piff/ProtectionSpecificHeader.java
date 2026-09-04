package com.googlecode.mp4parser.boxes.piff;

import com.coremedia.iso.Hex;
import com.googlecode.mp4parser.contentprotection.GenericHeader;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class ProtectionSpecificHeader {
    protected static Map<UUID, Class<? extends ProtectionSpecificHeader>> uuidRegistry = new HashMap();

    public static ProtectionSpecificHeader createFor(UUID uuid, ByteBuffer byteBuffer) {
        ProtectionSpecificHeader protectionSpecificHeaderNewInstance;
        Class<? extends ProtectionSpecificHeader> cls = uuidRegistry.get(uuid);
        if (cls != null) {
            try {
                protectionSpecificHeaderNewInstance = cls.newInstance();
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException(e11);
            }
        } else {
            protectionSpecificHeaderNewInstance = null;
        }
        if (protectionSpecificHeaderNewInstance == null) {
            protectionSpecificHeaderNewInstance = new GenericHeader();
        }
        protectionSpecificHeaderNewInstance.parse(byteBuffer);
        return protectionSpecificHeaderNewInstance;
    }

    public boolean equals(Object obj) {
        throw new RuntimeException("somebody called equals on me but that's not supposed to happen.");
    }

    public abstract ByteBuffer getData();

    public abstract UUID getSystemId();

    public abstract void parse(ByteBuffer byteBuffer);

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ProtectionSpecificHeader");
        sb2.append("{data=");
        ByteBuffer byteBufferDuplicate = getData().duplicate();
        byteBufferDuplicate.rewind();
        byte[] bArr = new byte[byteBufferDuplicate.limit()];
        byteBufferDuplicate.get(bArr);
        sb2.append(Hex.encodeHex(bArr));
        sb2.append('}');
        return sb2.toString();
    }
}
