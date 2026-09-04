package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.coremedia.iso.IsoTypeReader;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class ObjectDescriptorFactory {
    protected static Logger log = Logger.getLogger(ObjectDescriptorFactory.class.getName());
    protected static Map<Integer, Map<Integer, Class<? extends BaseDescriptor>>> descriptorRegistry = new HashMap();

    static {
        HashSet<Class<? extends BaseDescriptor>> hashSet = new HashSet();
        hashSet.add(DecoderSpecificInfo.class);
        hashSet.add(SLConfigDescriptor.class);
        hashSet.add(BaseDescriptor.class);
        hashSet.add(ExtensionDescriptor.class);
        hashSet.add(ObjectDescriptorBase.class);
        hashSet.add(ProfileLevelIndicationDescriptor.class);
        hashSet.add(AudioSpecificConfig.class);
        hashSet.add(ExtensionProfileLevelDescriptor.class);
        hashSet.add(ESDescriptor.class);
        hashSet.add(DecoderConfigDescriptor.class);
        for (Class<? extends BaseDescriptor> cls : hashSet) {
            Descriptor descriptor = (Descriptor) cls.getAnnotation(Descriptor.class);
            int[] iArrTags = descriptor.tags();
            int iObjectTypeIndication = descriptor.objectTypeIndication();
            Map<Integer, Class<? extends BaseDescriptor>> map = descriptorRegistry.get(Integer.valueOf(iObjectTypeIndication));
            if (map == null) {
                map = new HashMap<>();
            }
            for (int i10 : iArrTags) {
                map.put(Integer.valueOf(i10), cls);
            }
            descriptorRegistry.put(Integer.valueOf(iObjectTypeIndication), map);
        }
    }

    public static BaseDescriptor createFrom(int i10, ByteBuffer byteBuffer) {
        BaseDescriptor unknownDescriptor;
        int uInt8 = IsoTypeReader.readUInt8(byteBuffer);
        Map<Integer, Class<? extends BaseDescriptor>> map = descriptorRegistry.get(Integer.valueOf(i10));
        if (map == null) {
            map = descriptorRegistry.get(-1);
        }
        Class<? extends BaseDescriptor> cls = map.get(Integer.valueOf(uInt8));
        if (cls == null || cls.isInterface() || Modifier.isAbstract(cls.getModifiers())) {
            log.warning("No ObjectDescriptor found for objectTypeIndication " + Integer.toHexString(i10) + " and tag " + Integer.toHexString(uInt8) + " found: " + cls);
            unknownDescriptor = new UnknownDescriptor();
        } else {
            try {
                unknownDescriptor = cls.newInstance();
            } catch (Exception e10) {
                log.log(Level.SEVERE, "Couldn't instantiate BaseDescriptor class " + cls + " for objectTypeIndication " + i10 + " and tag " + uInt8, (Throwable) e10);
                throw new RuntimeException(e10);
            }
        }
        unknownDescriptor.parse(uInt8, byteBuffer);
        return unknownDescriptor;
    }
}
