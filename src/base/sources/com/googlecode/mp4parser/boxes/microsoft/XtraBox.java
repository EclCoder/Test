package com.googlecode.mp4parser.boxes.microsoft;

import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.mbridge.msdk.dycreator.subjectfactory.rcjU.KPtaxpyICj;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Vector;
import np.a;
import qp.b;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class XtraBox extends AbstractBox {
    private static final long FILETIME_EPOCH_DIFF = 11644473600000L;
    private static final long FILETIME_ONE_MILLISECOND = 10000;
    public static final int MP4_XTRA_BT_FILETIME = 21;
    public static final int MP4_XTRA_BT_GUID = 72;
    public static final int MP4_XTRA_BT_INT64 = 19;
    public static final int MP4_XTRA_BT_UNICODE = 8;
    public static final String TYPE = "Xtra";
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_0 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_1 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_10 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_2 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_3 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_4 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_5 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_6 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_7 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_8 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_9 = null;
    ByteBuffer data;
    private boolean successfulParse;
    Vector<XtraTag> tags;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class XtraValue {
        public Date fileTimeValue;
        public long longValue;
        public byte[] nonParsedValue;
        public String stringValue;
        public int type;

        private XtraValue() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void getContent(ByteBuffer byteBuffer) {
            try {
                byteBuffer.putInt(getContentSize());
                byteBuffer.putShort((short) this.type);
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                int i10 = this.type;
                if (i10 == 8) {
                    XtraBox.writeUtf16String(byteBuffer, this.stringValue);
                } else if (i10 == 19) {
                    byteBuffer.putLong(this.longValue);
                } else if (i10 != 21) {
                    byteBuffer.put(this.nonParsedValue);
                } else {
                    byteBuffer.putLong(XtraBox.millisToFiletime(this.fileTimeValue.getTime()));
                }
            } finally {
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getContentSize() {
            int i10 = this.type;
            if (i10 == 8) {
                return (this.stringValue.length() * 2) + 8;
            }
            if (i10 == 19 || i10 == 21) {
                return 14;
            }
            return this.nonParsedValue.length + 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object getValueAsObject() {
            int i10 = this.type;
            if (i10 == 8) {
                return this.stringValue;
            }
            if (i10 != 19) {
                return i10 != 21 ? this.nonParsedValue : this.fileTimeValue;
            }
            return new Long(this.longValue);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void parse(ByteBuffer byteBuffer) {
            int i10 = byteBuffer.getInt() - 6;
            this.type = byteBuffer.getShort();
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            int i11 = this.type;
            if (i11 == 8) {
                this.stringValue = XtraBox.readUtf16String(byteBuffer, i10);
            } else if (i11 == 19) {
                this.longValue = byteBuffer.getLong();
            } else if (i11 != 21) {
                byte[] bArr = new byte[i10];
                this.nonParsedValue = bArr;
                byteBuffer.get(bArr);
            } else {
                this.fileTimeValue = new Date(XtraBox.filetimeToMillis(byteBuffer.getLong()));
            }
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public String toString() {
            int i10 = this.type;
            if (i10 == 8) {
                return "[string]" + this.stringValue;
            }
            if (i10 == 19) {
                return "[long]" + String.valueOf(this.longValue);
            }
            if (i10 != 21) {
                return "[GUID](nonParsed)";
            }
            return "[filetime]" + this.fileTimeValue.toString();
        }

        /* synthetic */ XtraValue(XtraValue xtraValue) {
            this();
        }

        private XtraValue(String str) {
            this.type = 8;
            this.stringValue = str;
        }

        /* synthetic */ XtraValue(String str, XtraValue xtraValue) {
            this(str);
        }

        private XtraValue(long j10) {
            this.type = 19;
            this.longValue = j10;
        }

        /* synthetic */ XtraValue(long j10, XtraValue xtraValue) {
            this(j10);
        }

        private XtraValue(Date date) {
            this.type = 21;
            this.fileTimeValue = date;
        }

        /* synthetic */ XtraValue(Date date, XtraValue xtraValue) {
            this(date);
        }
    }

    static {
        ajc$preClinit();
    }

    public XtraBox() {
        super(TYPE);
        this.successfulParse = false;
        this.tags = new Vector<>();
    }

    private int detailSize() {
        int contentSize = 0;
        for (int i10 = 0; i10 < this.tags.size(); i10++) {
            contentSize += this.tags.elementAt(i10).getContentSize();
        }
        return contentSize;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long filetimeToMillis(long j10) {
        return (j10 / FILETIME_ONE_MILLISECOND) - FILETIME_EPOCH_DIFF;
    }

    private XtraTag getTagByName(String str) {
        for (XtraTag xtraTag : this.tags) {
            if (xtraTag.tagName.equals(str)) {
                return xtraTag;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long millisToFiletime(long j10) {
        return (j10 + FILETIME_EPOCH_DIFF) * FILETIME_ONE_MILLISECOND;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String readAsciiString(ByteBuffer byteBuffer, int i10) {
        byte[] bArr = new byte[i10];
        byteBuffer.get(bArr);
        try {
            return new String(bArr, C.ASCII_NAME);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("Shouldn't happen", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String readUtf16String(ByteBuffer byteBuffer, int i10) {
        int i11 = (i10 / 2) - 1;
        char[] cArr = new char[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            cArr[i12] = byteBuffer.getChar();
        }
        byteBuffer.getChar();
        return new String(cArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void writeAsciiString(ByteBuffer byteBuffer, String str) {
        try {
            byteBuffer.put(str.getBytes(C.ASCII_NAME));
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("Shouldn't happen", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void writeUtf16String(ByteBuffer byteBuffer, String str) {
        for (char c10 : str.toCharArray()) {
            byteBuffer.putChar(c10);
        }
        byteBuffer.putChar((char) 0);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        this.data = byteBuffer.slice();
        this.successfulParse = false;
        try {
            try {
                this.tags.clear();
                while (byteBuffer.remaining() > 0) {
                    XtraTag xtraTag = new XtraTag((XtraTag) null);
                    xtraTag.parse(byteBuffer);
                    this.tags.addElement(xtraTag);
                }
                int iDetailSize = detailSize();
                if (iRemaining == iDetailSize) {
                    this.successfulParse = true;
                    byteBuffer.order(ByteOrder.BIG_ENDIAN);
                    return;
                }
                throw new RuntimeException("Improperly handled Xtra tag: Calculated sizes don't match ( " + iRemaining + "/" + iDetailSize + ")");
            } catch (Exception e10) {
                this.successfulParse = false;
                System.err.println("Malformed Xtra Tag detected: " + e10.toString());
                e10.printStackTrace();
                byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
            }
        } catch (Throwable th2) {
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
            throw th2;
        }
    }

    public String[] getAllTagNames() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_1, this, this));
        String[] strArr = new String[this.tags.size()];
        for (int i10 = 0; i10 < this.tags.size(); i10++) {
            strArr[i10] = this.tags.elementAt(i10).tagName;
        }
        return strArr;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        if (!this.successfulParse) {
            this.data.rewind();
            byteBuffer.put(this.data);
        } else {
            for (int i10 = 0; i10 < this.tags.size(); i10++) {
                this.tags.elementAt(i10).getContent(byteBuffer);
            }
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return this.successfulParse ? detailSize() : this.data.limit();
    }

    public Date getFirstDateValue(String str) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_3, this, this, str));
        for (Object obj : getValues(str)) {
            if (obj instanceof Date) {
                return (Date) obj;
            }
        }
        return null;
    }

    public Long getFirstLongValue(String str) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_4, this, this, str));
        for (Object obj : getValues(str)) {
            if (obj instanceof Long) {
                return (Long) obj;
            }
        }
        return null;
    }

    public String getFirstStringValue(String str) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_2, this, this, str));
        for (Object obj : getValues(str)) {
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        return null;
    }

    public Object[] getValues(String str) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_5, this, this, str));
        XtraTag tagByName = getTagByName(str);
        if (tagByName == null) {
            return new Object[0];
        }
        Object[] objArr = new Object[tagByName.values.size()];
        for (int i10 = 0; i10 < tagByName.values.size(); i10++) {
            objArr[i10] = ((XtraValue) tagByName.values.elementAt(i10)).getValueAsObject();
        }
        return objArr;
    }

    public void removeTag(String str) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_6, this, this, str));
        XtraTag tagByName = getTagByName(str);
        if (tagByName != null) {
            this.tags.remove(tagByName);
        }
    }

    public void setTagValue(String str, String str2) {
        RequiresParseDetailAspect.aspectOf().before(b.e(ajc$tjp_8, this, this, str, str2));
        setTagValues(str, new String[]{str2});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTagValues(String str, String[] strArr) {
        RequiresParseDetailAspect.aspectOf().before(b.e(ajc$tjp_7, this, this, str, strArr));
        removeTag(str);
        Object[] objArr = 0;
        XtraTag xtraTag = new XtraTag(str, null);
        for (String str2 : strArr) {
            xtraTag.values.addElement(new XtraValue(str2, (XtraValue) (objArr == true ? 1 : 0)));
        }
        this.tags.addElement(xtraTag);
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_0, this, this));
        if (!isParsed()) {
            parseDetails();
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("XtraBox[");
        for (XtraTag xtraTag : this.tags) {
            for (XtraValue xtraValue : xtraTag.values) {
                stringBuffer.append(xtraTag.tagName);
                stringBuffer.append("=");
                stringBuffer.append(xtraValue.toString());
                stringBuffer.append(";");
            }
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class XtraTag {
        private int inputSize;
        private String tagName;
        private Vector<XtraValue> values;

        private XtraTag() {
            this.values = new Vector<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void getContent(ByteBuffer byteBuffer) {
            byteBuffer.putInt(getContentSize());
            byteBuffer.putInt(this.tagName.length());
            XtraBox.writeAsciiString(byteBuffer, this.tagName);
            byteBuffer.putInt(this.values.size());
            for (int i10 = 0; i10 < this.values.size(); i10++) {
                this.values.elementAt(i10).getContent(byteBuffer);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getContentSize() {
            int length = this.tagName.length() + 12;
            for (int i10 = 0; i10 < this.values.size(); i10++) {
                length += this.values.elementAt(i10).getContentSize();
            }
            return length;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void parse(ByteBuffer byteBuffer) {
            this.inputSize = byteBuffer.getInt();
            this.tagName = XtraBox.readAsciiString(byteBuffer, byteBuffer.getInt());
            int i10 = byteBuffer.getInt();
            for (int i11 = 0; i11 < i10; i11++) {
                XtraValue xtraValue = new XtraValue((XtraValue) null);
                xtraValue.parse(byteBuffer);
                this.values.addElement(xtraValue);
            }
            if (this.inputSize == getContentSize()) {
                return;
            }
            throw new RuntimeException("Improperly handled Xtra tag: Sizes don't match ( " + this.inputSize + "/" + getContentSize() + ") on " + this.tagName);
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.tagName);
            stringBuffer.append(" [");
            stringBuffer.append(this.inputSize);
            stringBuffer.append("/");
            stringBuffer.append(this.values.size());
            stringBuffer.append("]:\n");
            for (int i10 = 0; i10 < this.values.size(); i10++) {
                stringBuffer.append("  ");
                stringBuffer.append(this.values.elementAt(i10).toString());
                stringBuffer.append("\n");
            }
            return stringBuffer.toString();
        }

        /* synthetic */ XtraTag(XtraTag xtraTag) {
            this();
        }

        /* synthetic */ XtraTag(String str, XtraTag xtraTag) {
            this(str);
        }

        private XtraTag(String str) {
            this();
            this.tagName = str;
        }
    }

    private static /* synthetic */ void ajc$preClinit() {
        b bVar = new b("XtraBox.java", XtraBox.class);
        ajc$tjp_0 = bVar.h("method-execution", bVar.g("1", "toString", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "", "", "", "java.lang.String"), 88);
        ajc$tjp_1 = bVar.h("method-execution", bVar.g("1", "getAllTagNames", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "", "", "", "[Ljava.lang.String;"), 151);
        ajc$tjp_10 = bVar.h("method-execution", bVar.g("1", "setTagValue", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String:long", "name:value", "", "void"), 289);
        ajc$tjp_2 = bVar.h("method-execution", bVar.g("1", "getFirstStringValue", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String", "name", "", "java.lang.String"), 166);
        ajc$tjp_3 = bVar.h("method-execution", bVar.g("1", "getFirstDateValue", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String", "name", "", "java.util.Date"), 183);
        ajc$tjp_4 = bVar.h("method-execution", bVar.g("1", "getFirstLongValue", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String", "name", "", "java.lang.Long"), 200);
        ajc$tjp_5 = bVar.h("method-execution", bVar.g("1", "getValues", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String", "name", KPtaxpyICj.lhXTkCUZq, "[Ljava.lang.Object;"), Sdk$SDKError.b.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE);
        ajc$tjp_6 = bVar.h("method-execution", bVar.g("1", "removeTag", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String", "name", "", "void"), 236);
        ajc$tjp_7 = bVar.h("method-execution", bVar.g("1", "setTagValues", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String:[Ljava.lang.String;", "name:values", "", "void"), 249);
        ajc$tjp_8 = bVar.h("method-execution", bVar.g("1", "setTagValue", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String:java.lang.String", "name:value", "", "void"), 265);
        ajc$tjp_9 = bVar.h("method-execution", bVar.g("1", "setTagValue", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String:java.util.Date", "name:date", "", "void"), 276);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTagValue(String str, Date date) {
        RequiresParseDetailAspect.aspectOf().before(b.e(ajc$tjp_9, this, this, str, date));
        removeTag(str);
        XtraTag xtraTag = new XtraTag(str, null);
        xtraTag.values.addElement(new XtraValue(date, (XtraValue) (0 == true ? 1 : 0)));
        this.tags.addElement(xtraTag);
    }

    public XtraBox(String str) {
        super(str);
        this.successfulParse = false;
        this.tags = new Vector<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTagValue(String str, long j10) {
        RequiresParseDetailAspect.aspectOf().before(b.e(ajc$tjp_10, this, this, str, pp.a.f(j10)));
        removeTag(str);
        XtraTag xtraTag = new XtraTag(str, null);
        xtraTag.values.addElement(new XtraValue(j10, (XtraValue) (0 == true ? 1 : 0)));
        this.tags.addElement(xtraTag);
    }
}
