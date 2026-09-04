package com.googlecode.mp4parser;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.util.CastUtils;
import com.googlecode.mp4parser.util.LazyList;
import com.googlecode.mp4parser.util.Logger;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class BasicContainer implements Container, Iterator<Box>, Closeable {
    private static final Box EOF = new AbstractBox("eof ") { // from class: com.googlecode.mp4parser.BasicContainer.1
        @Override // com.googlecode.mp4parser.AbstractBox
        protected long getContentSize() {
            return 0L;
        }

        @Override // com.googlecode.mp4parser.AbstractBox
        protected void _parseDetails(ByteBuffer byteBuffer) {
        }

        @Override // com.googlecode.mp4parser.AbstractBox
        protected void getContent(ByteBuffer byteBuffer) {
        }
    };
    private static Logger LOG = Logger.getLogger(BasicContainer.class);
    protected BoxParser boxParser;
    protected DataSource dataSource;
    Box lookahead = null;
    long parsePosition = 0;
    long startPosition = 0;
    long endPosition = 0;
    private List<Box> boxes = new ArrayList();

    public void addBox(Box box) {
        if (box != null) {
            this.boxes = new ArrayList(getBoxes());
            box.setParent(this);
            this.boxes.add(box);
        }
    }

    public void close() {
        this.dataSource.close();
    }

    @Override // com.coremedia.iso.boxes.Container
    public List<Box> getBoxes() {
        return (this.dataSource == null || this.lookahead == EOF) ? this.boxes : new LazyList(this.boxes, this);
    }

    @Override // com.coremedia.iso.boxes.Container
    public ByteBuffer getByteBuffer(long j10, long j11) throws IOException {
        ByteBuffer map;
        DataSource dataSource = this.dataSource;
        if (dataSource != null) {
            synchronized (dataSource) {
                map = this.dataSource.map(this.startPosition + j10, j11);
            }
            return map;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(CastUtils.l2i(j11));
        long j12 = j11 + j10;
        long j13 = 0;
        for (Box box : this.boxes) {
            long size = box.getSize() + j13;
            if (size > j10 && j13 < j12) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                WritableByteChannel writableByteChannelNewChannel = Channels.newChannel(byteArrayOutputStream);
                box.getBox(writableByteChannelNewChannel);
                writableByteChannelNewChannel.close();
                if (j13 >= j10 && size <= j12) {
                    byteBufferAllocate.put(byteArrayOutputStream.toByteArray());
                } else if (j13 < j10 && size > j12) {
                    long j14 = j10 - j13;
                    byteBufferAllocate.put(byteArrayOutputStream.toByteArray(), CastUtils.l2i(j14), CastUtils.l2i((box.getSize() - j14) - (size - j12)));
                } else if (j13 < j10 && size <= j12) {
                    long j15 = j10 - j13;
                    byteBufferAllocate.put(byteArrayOutputStream.toByteArray(), CastUtils.l2i(j15), CastUtils.l2i(box.getSize() - j15));
                } else if (j13 >= j10 && size > j12) {
                    byteBufferAllocate.put(byteArrayOutputStream.toByteArray(), 0, CastUtils.l2i(box.getSize() - (size - j12)));
                }
            }
            j13 = size;
        }
        return (ByteBuffer) byteBufferAllocate.rewind();
    }

    protected long getContainerSize() {
        long size = 0;
        for (int i10 = 0; i10 < getBoxes().size(); i10++) {
            size += this.boxes.get(i10).getSize();
        }
        return size;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        Box box = this.lookahead;
        if (box == EOF) {
            return false;
        }
        if (box != null) {
            return true;
        }
        try {
            this.lookahead = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.lookahead = EOF;
            return false;
        }
    }

    public void initContainer(DataSource dataSource, long j10, BoxParser boxParser) {
        this.dataSource = dataSource;
        long jPosition = dataSource.position();
        this.startPosition = jPosition;
        this.parsePosition = jPosition;
        dataSource.position(dataSource.position() + j10);
        this.endPosition = dataSource.position();
        this.boxParser = boxParser;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // com.coremedia.iso.boxes.Container
    public void setBoxes(List<Box> list) {
        this.boxes = new ArrayList(list);
        this.lookahead = EOF;
        this.dataSource = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("[");
        for (int i10 = 0; i10 < this.boxes.size(); i10++) {
            if (i10 > 0) {
                sb2.append(";");
            }
            sb2.append(this.boxes.get(i10).toString());
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // com.coremedia.iso.boxes.Container
    public final void writeContainer(WritableByteChannel writableByteChannel) {
        Iterator<Box> it = getBoxes().iterator();
        while (it.hasNext()) {
            it.next().getBox(writableByteChannel);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public Box next() {
        Box box;
        Box box2 = this.lookahead;
        if (box2 != null && box2 != EOF) {
            this.lookahead = null;
            return box2;
        }
        DataSource dataSource = this.dataSource;
        if (dataSource == null || this.parsePosition >= this.endPosition) {
            this.lookahead = EOF;
            throw new NoSuchElementException();
        }
        try {
            synchronized (dataSource) {
                this.dataSource.position(this.parsePosition);
                box = this.boxParser.parseBox(this.dataSource, this);
                this.parsePosition = this.dataSource.position();
            }
            return box;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    @Override // com.coremedia.iso.boxes.Container
    public <T extends Box> List<T> getBoxes(Class<T> cls) {
        List<Box> boxes = getBoxes();
        ArrayList arrayList = null;
        Box box = null;
        for (int i10 = 0; i10 < boxes.size(); i10++) {
            Box box2 = boxes.get(i10);
            if (cls.isInstance(box2)) {
                if (box == null) {
                    box = box2;
                } else {
                    if (arrayList == null) {
                        arrayList = new ArrayList(2);
                        arrayList.add(box);
                    }
                    arrayList.add(box2);
                }
            }
        }
        if (arrayList != null) {
            return arrayList;
        }
        if (box != null) {
            return Collections.singletonList(box);
        }
        return Collections.EMPTY_LIST;
    }

    @Override // com.coremedia.iso.boxes.Container
    public <T extends Box> List<T> getBoxes(Class<T> cls, boolean z10) {
        ArrayList arrayList = new ArrayList(2);
        List<Box> boxes = getBoxes();
        for (int i10 = 0; i10 < boxes.size(); i10++) {
            Box box = boxes.get(i10);
            if (cls.isInstance(box)) {
                arrayList.add(box);
            }
            if (z10 && (box instanceof Container)) {
                arrayList.addAll(((Container) box).getBoxes(cls, z10));
            }
        }
        return arrayList;
    }
}
