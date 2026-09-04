package com.coremedia.iso;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.UserBox;
import com.googlecode.mp4parser.DataSource;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBoxParser implements BoxParser {
    private static Logger LOG = Logger.getLogger(AbstractBoxParser.class.getName());
    ThreadLocal<ByteBuffer> header = new ThreadLocal<ByteBuffer>() { // from class: com.coremedia.iso.AbstractBoxParser.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public ByteBuffer initialValue() {
            return ByteBuffer.allocate(32);
        }
    };

    public abstract Box createBox(String str, byte[] bArr, String str2);

    @Override // com.coremedia.iso.BoxParser
    public Box parseBox(DataSource dataSource, Container container) throws EOFException {
        long size;
        AbstractBoxParser abstractBoxParser = this;
        long jPosition = dataSource.position();
        abstractBoxParser.header.get().rewind().limit(8);
        while (true) {
            int i10 = dataSource.read(abstractBoxParser.header.get());
            if (i10 == 8) {
                abstractBoxParser.header.get().rewind();
                long uInt32 = IsoTypeReader.readUInt32(abstractBoxParser.header.get());
                byte[] bArr = null;
                if (uInt32 < 8 && uInt32 > 1) {
                    LOG.severe("Plausibility check failed: size < 8 (size = " + uInt32 + "). Stop parsing!");
                    return null;
                }
                String str = IsoTypeReader.read4cc(abstractBoxParser.header.get());
                if (uInt32 == 1) {
                    abstractBoxParser.header.get().limit(16);
                    dataSource.read(abstractBoxParser.header.get());
                    abstractBoxParser.header.get().position(8);
                    size = IsoTypeReader.readUInt64(abstractBoxParser.header.get()) - 16;
                } else {
                    size = uInt32 == 0 ? dataSource.size() - dataSource.position() : uInt32 - 8;
                }
                if (UserBox.TYPE.equals(str)) {
                    abstractBoxParser.header.get().limit(abstractBoxParser.header.get().limit() + 16);
                    dataSource.read(abstractBoxParser.header.get());
                    byte[] bArr2 = new byte[16];
                    for (int iPosition = abstractBoxParser.header.get().position() - 16; iPosition < abstractBoxParser.header.get().position(); iPosition++) {
                        bArr2[iPosition - (abstractBoxParser.header.get().position() - 16)] = abstractBoxParser.header.get().get(iPosition);
                    }
                    size -= 16;
                    bArr = bArr2;
                }
                Box boxCreateBox = abstractBoxParser.createBox(str, bArr, container instanceof Box ? ((Box) container).getType() : "");
                boxCreateBox.setParent(container);
                abstractBoxParser.header.get().rewind();
                boxCreateBox.parse(dataSource, abstractBoxParser.header.get(), size, abstractBoxParser);
                return boxCreateBox;
            }
            if (i10 < 0) {
                dataSource.position(jPosition);
                throw new EOFException();
            }
            abstractBoxParser = this;
        }
    }
}
