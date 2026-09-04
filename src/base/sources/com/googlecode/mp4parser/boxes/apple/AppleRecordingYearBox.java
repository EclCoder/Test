package com.googlecode.mp4parser.boxes.apple;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import j$.util.DesugarTimeZone;
import java.nio.ByteBuffer;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import np.a;
import qp.b;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class AppleRecordingYearBox extends AppleDataBox {
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_0 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_1 = null;
    Date date;

    /* JADX INFO: renamed from: df, reason: collision with root package name */
    DateFormat f22493df;

    static {
        ajc$preClinit();
    }

    public AppleRecordingYearBox() {
        super("©day", 1);
        this.date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'kk:mm:ssZ");
        this.f22493df = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        b bVar = new b("AppleRecordingYearBox.java", AppleRecordingYearBox.class);
        ajc$tjp_0 = bVar.h("method-execution", bVar.g("1", "getDate", "com.googlecode.mp4parser.boxes.apple.AppleRecordingYearBox", "", "", "", "java.util.Date"), 27);
        ajc$tjp_1 = bVar.h("method-execution", bVar.g("1", "setDate", "com.googlecode.mp4parser.boxes.apple.AppleRecordingYearBox", "java.util.Date", "date", "", "void"), 31);
    }

    protected static String iso8601toRfc822Date(String str) {
        return str.replaceAll("Z$", "+0000").replaceAll("([0-9][0-9]):([0-9][0-9])$", "$1$2");
    }

    protected static String rfc822toIso8601Date(String str) {
        return str.replaceAll("\\+0000$", "Z");
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    protected int getDataLength() {
        return Utf8.convert(rfc822toIso8601Date(this.f22493df.format(this.date))).length;
    }

    public Date getDate() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_0, this, this));
        return this.date;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    protected void parseData(ByteBuffer byteBuffer) {
        try {
            this.date = this.f22493df.parse(iso8601toRfc822Date(IsoTypeReader.readString(byteBuffer, byteBuffer.remaining())));
        } catch (ParseException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void setDate(Date date) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_1, this, this, date));
        this.date = date;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    protected byte[] writeData() {
        return Utf8.convert(rfc822toIso8601Date(this.f22493df.format(this.date)));
    }
}
