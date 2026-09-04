package com.coremedia.iso;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.MovieBox;
import com.googlecode.mp4parser.BasicContainer;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.FileDataSourceImpl;
import com.googlecode.mp4parser.annotations.DoNotParseDetail;
import com.googlecode.mp4parser.util.Logger;
import java.io.Closeable;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
@DoNotParseDetail
public class IsoFile extends BasicContainer implements Closeable {
    private static Logger LOG = Logger.getLogger(IsoFile.class);

    public IsoFile(String str) {
        this(new FileDataSourceImpl(new File(str)));
    }

    public static String bytesToFourCC(byte[] bArr) {
        byte[] bArr2 = new byte[4];
        if (bArr != null) {
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, 4));
        }
        try {
            return new String(bArr2, "ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new Error("Required character encoding is missing", e10);
        }
    }

    public static byte[] fourCCtoBytes(String str) {
        byte[] bArr = new byte[4];
        if (str != null) {
            for (int i10 = 0; i10 < Math.min(4, str.length()); i10++) {
                bArr[i10] = (byte) str.charAt(i10);
            }
        }
        return bArr;
    }

    @Override // com.googlecode.mp4parser.BasicContainer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.dataSource.close();
    }

    public void getBox(WritableByteChannel writableByteChannel) {
        writeContainer(writableByteChannel);
    }

    public MovieBox getMovieBox() {
        for (Box box : getBoxes()) {
            if (box instanceof MovieBox) {
                return (MovieBox) box;
            }
        }
        return null;
    }

    public long getSize() {
        return getContainerSize();
    }

    @Override // com.googlecode.mp4parser.BasicContainer
    public String toString() {
        return "model(" + this.dataSource.toString() + ")";
    }

    public IsoFile(DataSource dataSource) {
        this(dataSource, new PropertyBoxParserImpl(new String[0]));
    }

    public IsoFile(DataSource dataSource, BoxParser boxParser) {
        initContainer(dataSource, dataSource.size(), boxParser);
    }
}
