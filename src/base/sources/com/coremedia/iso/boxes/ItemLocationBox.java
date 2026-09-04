package com.coremedia.iso.boxes;

import com.android.vending.billing.fTvD.qEagQqzJZsd;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeReaderVariable;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.IsoTypeWriterVariable;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.mbridge.msdk.dycreator.subjectfactory.rcjU.KPtaxpyICj;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import np.a;
import qp.b;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class ItemLocationBox extends AbstractFullBox {
    public static final String TYPE = "iloc";
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_0 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_1 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_10 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_11 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_2 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_3 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_4 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_5 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_6 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_7 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_8 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_9 = null;
    public int baseOffsetSize;
    public int indexSize;
    public List<Item> items;
    public int lengthSize;
    public int offsetSize;

    static {
        ajc$preClinit();
    }

    public ItemLocationBox() {
        super(TYPE);
        this.offsetSize = 8;
        this.lengthSize = 8;
        this.baseOffsetSize = 8;
        this.indexSize = 0;
        this.items = new LinkedList();
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int uInt8 = IsoTypeReader.readUInt8(byteBuffer);
        this.offsetSize = uInt8 >>> 4;
        this.lengthSize = uInt8 & 15;
        int uInt9 = IsoTypeReader.readUInt8(byteBuffer);
        this.baseOffsetSize = uInt9 >>> 4;
        if (getVersion() == 1) {
            this.indexSize = uInt9 & 15;
        }
        int uInt16 = IsoTypeReader.readUInt16(byteBuffer);
        for (int i10 = 0; i10 < uInt16; i10++) {
            this.items.add(new Item(byteBuffer));
        }
    }

    public Extent createExtent(long j10, long j11, long j12) {
        RequiresParseDetailAspect.aspectOf().before(b.f(ajc$tjp_11, this, this, new Object[]{pp.a.f(j10), pp.a.f(j11), pp.a.f(j12)}));
        return new Extent(j10, j11, j12);
    }

    public Item createItem(int i10, int i11, int i12, long j10, List<Extent> list) {
        RequiresParseDetailAspect.aspectOf().before(b.f(ajc$tjp_10, this, this, new Object[]{pp.a.e(i10), pp.a.e(i11), pp.a.e(i12), pp.a.f(j10), list}));
        return new Item(i10, i11, i12, j10, list);
    }

    public int getBaseOffsetSize() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_4, this, this));
        return this.baseOffsetSize;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt8(byteBuffer, (this.offsetSize << 4) | this.lengthSize);
        if (getVersion() == 1) {
            IsoTypeWriter.writeUInt8(byteBuffer, (this.baseOffsetSize << 4) | this.indexSize);
        } else {
            IsoTypeWriter.writeUInt8(byteBuffer, this.baseOffsetSize << 4);
        }
        IsoTypeWriter.writeUInt16(byteBuffer, this.items.size());
        Iterator<Item> it = this.items.iterator();
        while (it.hasNext()) {
            it.next().getContent(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        Iterator<Item> it = this.items.iterator();
        long size = 8;
        while (it.hasNext()) {
            size += (long) it.next().getSize();
        }
        return size;
    }

    public int getIndexSize() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_6, this, this));
        return this.indexSize;
    }

    public List<Item> getItems() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_8, this, this));
        return this.items;
    }

    public int getLengthSize() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_2, this, this));
        return this.lengthSize;
    }

    public int getOffsetSize() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_0, this, this));
        return this.offsetSize;
    }

    public void setBaseOffsetSize(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_5, this, this, pp.a.e(i10)));
        this.baseOffsetSize = i10;
    }

    public void setIndexSize(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_7, this, this, pp.a.e(i10)));
        this.indexSize = i10;
    }

    public void setItems(List<Item> list) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_9, this, this, list));
        this.items = list;
    }

    public void setLengthSize(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_3, this, this, pp.a.e(i10)));
        this.lengthSize = i10;
    }

    public void setOffsetSize(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_1, this, this, pp.a.e(i10)));
        this.offsetSize = i10;
    }

    private static /* synthetic */ void ajc$preClinit() {
        b bVar = new b("ItemLocationBox.java", ItemLocationBox.class);
        ajc$tjp_0 = bVar.h("method-execution", bVar.g("1", "getOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "int"), Sdk$SDKError.b.JSON_ENCODE_ERROR_VALUE);
        ajc$tjp_1 = bVar.h("method-execution", bVar.g("1", "setOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", "int", "offsetSize", "", "void"), Sdk$SDKError.b.INVALID_RI_ENDPOINT_VALUE);
        ajc$tjp_10 = bVar.h("method-execution", bVar.g("1", "createItem", "com.coremedia.iso.boxes.ItemLocationBox", "int:int:int:long:java.util.List", "itemId:constructionMethod:dataReferenceIndex:baseOffset:extents", "", "com.coremedia.iso.boxes.ItemLocationBox$Item"), 160);
        ajc$tjp_11 = bVar.h("method-execution", bVar.g("1", "createExtent", "com.coremedia.iso.boxes.ItemLocationBox", "long:long:long", "extentOffset:extentLength:extentIndex", "", "com.coremedia.iso.boxes.ItemLocationBox$Extent"), 285);
        ajc$tjp_2 = bVar.h("method-execution", bVar.g("1", "getLengthSize", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "int"), Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
        ajc$tjp_3 = bVar.h("method-execution", bVar.g("1", "setLengthSize", "com.coremedia.iso.boxes.ItemLocationBox", "int", "lengthSize", "", "void"), Sdk$SDKError.b.MRAID_JS_WRITE_FAILED_VALUE);
        ajc$tjp_4 = bVar.h("method-execution", bVar.g("1", "getBaseOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", qEagQqzJZsd.aykJCayCtxOlMu), 135);
        ajc$tjp_5 = bVar.h("method-execution", bVar.g("1", "setBaseOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", "int", "baseOffsetSize", "", "void"), 139);
        ajc$tjp_6 = bVar.h("method-execution", bVar.g("1", "getIndexSize", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "int"), 143);
        ajc$tjp_7 = bVar.h("method-execution", bVar.g("1", "setIndexSize", "com.coremedia.iso.boxes.ItemLocationBox", "int", "indexSize", "", "void"), 147);
        ajc$tjp_8 = bVar.h("method-execution", bVar.g("1", "getItems", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "java.util.List"), 151);
        ajc$tjp_9 = bVar.h("method-execution", bVar.g(KPtaxpyICj.ZQcZbn, "setItems", "com.coremedia.iso.boxes.ItemLocationBox", "java.util.List", "items", "", "void"), 155);
    }

    Extent createExtent(ByteBuffer byteBuffer) {
        return new Extent(byteBuffer);
    }

    Item createItem(ByteBuffer byteBuffer) {
        return new Item(byteBuffer);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class Extent {
        public long extentIndex;
        public long extentLength;
        public long extentOffset;

        public Extent(long j10, long j11, long j12) {
            this.extentOffset = j10;
            this.extentLength = j11;
            this.extentIndex = j12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Extent extent = (Extent) obj;
            return this.extentIndex == extent.extentIndex && this.extentLength == extent.extentLength && this.extentOffset == extent.extentOffset;
        }

        public void getContent(ByteBuffer byteBuffer) {
            int i10;
            if (ItemLocationBox.this.getVersion() == 1 && (i10 = ItemLocationBox.this.indexSize) > 0) {
                IsoTypeWriterVariable.write(this.extentIndex, byteBuffer, i10);
            }
            IsoTypeWriterVariable.write(this.extentOffset, byteBuffer, ItemLocationBox.this.offsetSize);
            IsoTypeWriterVariable.write(this.extentLength, byteBuffer, ItemLocationBox.this.lengthSize);
        }

        public int getSize() {
            ItemLocationBox itemLocationBox = ItemLocationBox.this;
            int i10 = itemLocationBox.indexSize;
            if (i10 <= 0) {
                i10 = 0;
            }
            return i10 + itemLocationBox.offsetSize + itemLocationBox.lengthSize;
        }

        public int hashCode() {
            long j10 = this.extentOffset;
            long j11 = this.extentLength;
            int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.extentIndex;
            return i10 + ((int) ((j12 >>> 32) ^ j12));
        }

        public String toString() {
            return "Extent{extentOffset=" + this.extentOffset + ", extentLength=" + this.extentLength + ", extentIndex=" + this.extentIndex + '}';
        }

        public Extent(ByteBuffer byteBuffer) {
            int i10;
            if (ItemLocationBox.this.getVersion() == 1 && (i10 = ItemLocationBox.this.indexSize) > 0) {
                this.extentIndex = IsoTypeReaderVariable.read(byteBuffer, i10);
            }
            this.extentOffset = IsoTypeReaderVariable.read(byteBuffer, ItemLocationBox.this.offsetSize);
            this.extentLength = IsoTypeReaderVariable.read(byteBuffer, ItemLocationBox.this.lengthSize);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class Item {
        public long baseOffset;
        public int constructionMethod;
        public int dataReferenceIndex;
        public List<Extent> extents;
        public int itemId;

        public Item(ByteBuffer byteBuffer) {
            this.extents = new LinkedList();
            this.itemId = IsoTypeReader.readUInt16(byteBuffer);
            if (ItemLocationBox.this.getVersion() == 1) {
                this.constructionMethod = IsoTypeReader.readUInt16(byteBuffer) & 15;
            }
            this.dataReferenceIndex = IsoTypeReader.readUInt16(byteBuffer);
            int i10 = ItemLocationBox.this.baseOffsetSize;
            if (i10 > 0) {
                this.baseOffset = IsoTypeReaderVariable.read(byteBuffer, i10);
            } else {
                this.baseOffset = 0L;
            }
            int uInt16 = IsoTypeReader.readUInt16(byteBuffer);
            for (int i11 = 0; i11 < uInt16; i11++) {
                this.extents.add(ItemLocationBox.this.new Extent(byteBuffer));
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Item item = (Item) obj;
            if (this.baseOffset != item.baseOffset || this.constructionMethod != item.constructionMethod || this.dataReferenceIndex != item.dataReferenceIndex || this.itemId != item.itemId) {
                return false;
            }
            List<Extent> list = this.extents;
            List<Extent> list2 = item.extents;
            return list == null ? list2 == null : list.equals(list2);
        }

        public void getContent(ByteBuffer byteBuffer) {
            IsoTypeWriter.writeUInt16(byteBuffer, this.itemId);
            if (ItemLocationBox.this.getVersion() == 1) {
                IsoTypeWriter.writeUInt16(byteBuffer, this.constructionMethod);
            }
            IsoTypeWriter.writeUInt16(byteBuffer, this.dataReferenceIndex);
            int i10 = ItemLocationBox.this.baseOffsetSize;
            if (i10 > 0) {
                IsoTypeWriterVariable.write(this.baseOffset, byteBuffer, i10);
            }
            IsoTypeWriter.writeUInt16(byteBuffer, this.extents.size());
            Iterator<Extent> it = this.extents.iterator();
            while (it.hasNext()) {
                it.next().getContent(byteBuffer);
            }
        }

        public int getSize() {
            int size = (ItemLocationBox.this.getVersion() == 1 ? 4 : 2) + 2 + ItemLocationBox.this.baseOffsetSize + 2;
            Iterator<Extent> it = this.extents.iterator();
            while (it.hasNext()) {
                size += it.next().getSize();
            }
            return size;
        }

        public int hashCode() {
            int i10 = ((((this.itemId * 31) + this.constructionMethod) * 31) + this.dataReferenceIndex) * 31;
            long j10 = this.baseOffset;
            int i11 = (i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            List<Extent> list = this.extents;
            return i11 + (list != null ? list.hashCode() : 0);
        }

        public void setBaseOffset(long j10) {
            this.baseOffset = j10;
        }

        public String toString() {
            return "Item{baseOffset=" + this.baseOffset + ", itemId=" + this.itemId + ", constructionMethod=" + this.constructionMethod + ", dataReferenceIndex=" + this.dataReferenceIndex + ", extents=" + this.extents + '}';
        }

        public Item(int i10, int i11, int i12, long j10, List<Extent> list) {
            new LinkedList();
            this.itemId = i10;
            this.constructionMethod = i11;
            this.dataReferenceIndex = i12;
            this.baseOffset = j10;
            this.extents = list;
        }
    }
}
