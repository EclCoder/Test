package com.googlecode.mp4parser.boxes.apple;

import com.android.vending.billing.fTvD.qEagQqzJZsd;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.annotations.DoNotParseDetail;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.subjectfactory.rcjU.KPtaxpyICj;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Locale;
import np.a;
import qp.b;
import wc.XtO.NpmRNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AppleDataBox extends AbstractBox {
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_0 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_1 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_2 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_3 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_4 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_5 = null;
    private static HashMap<String, String> language;
    int dataCountry;
    int dataLanguage;
    int dataType;

    protected AppleDataBox(String str, int i10) {
        super(str);
        this.dataType = i10;
    }

    private static /* synthetic */ void ajc$preClinit() {
        b bVar = new b("AppleDataBox.java", AppleDataBox.class);
        ajc$tjp_0 = bVar.h("method-execution", bVar.g("1", "getLanguageString", "com.googlecode.mp4parser.boxes.apple.AppleDataBox", "", "", "", "java.lang.String"), 25);
        ajc$tjp_1 = bVar.h("method-execution", bVar.g("1", "getDataType", "com.googlecode.mp4parser.boxes.apple.AppleDataBox", "", "", "", "int"), 43);
        ajc$tjp_2 = bVar.h("method-execution", bVar.g("1", "getDataCountry", "com.googlecode.mp4parser.boxes.apple.AppleDataBox", "", "", "", "int"), 47);
        ajc$tjp_3 = bVar.h("method-execution", bVar.g("1", "setDataCountry", "com.googlecode.mp4parser.boxes.apple.AppleDataBox", "int", "dataCountry", "", "void"), 51);
        ajc$tjp_4 = bVar.h("method-execution", bVar.g("1", "getDataLanguage", "com.googlecode.mp4parser.boxes.apple.AppleDataBox", "", "", "", "int"), 55);
        ajc$tjp_5 = bVar.h("method-execution", bVar.g("1", "setDataLanguage", "com.googlecode.mp4parser.boxes.apple.AppleDataBox", "int", "dataLanguage", "", "void"), 59);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer) {
        parseData(parseDataLength4ccTypeCountryLanguageAndReturnRest(byteBuffer));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeDataLength4ccTypeCountryLanguage(byteBuffer);
        byteBuffer.put(writeData());
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return getDataLength() + 16;
    }

    public int getDataCountry() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_2, this, this));
        return this.dataCountry;
    }

    public int getDataLanguage() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_4, this, this));
        return this.dataLanguage;
    }

    protected abstract int getDataLength();

    public int getDataType() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_1, this, this));
        return this.dataType;
    }

    public String getLanguageString() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_0, this, this));
        HashMap<String, String> map = language;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.dataLanguage);
        String str = map.get(sb2.toString());
        if (str != null) {
            return str;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[2]);
        IsoTypeWriter.writeUInt16(byteBufferWrap, this.dataLanguage);
        byteBufferWrap.reset();
        return new Locale(IsoTypeReader.readIso639(byteBufferWrap)).getDisplayLanguage();
    }

    protected abstract void parseData(ByteBuffer byteBuffer);

    @DoNotParseDetail
    protected ByteBuffer parseDataLength4ccTypeCountryLanguageAndReturnRest(ByteBuffer byteBuffer) {
        int i10 = byteBuffer.getInt();
        byteBuffer.getInt();
        this.dataType = byteBuffer.getInt();
        short s10 = byteBuffer.getShort();
        this.dataCountry = s10;
        if (s10 < 0) {
            this.dataCountry = s10 + C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        short s11 = byteBuffer.getShort();
        this.dataLanguage = s11;
        if (s11 < 0) {
            this.dataLanguage = s11 + C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        int i11 = i10 - 16;
        ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.duplicate().slice().limit(i11);
        byteBuffer.position(i11 + byteBuffer.position());
        return byteBuffer2;
    }

    public void setDataCountry(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_3, this, this, pp.a.e(i10)));
        this.dataCountry = i10;
    }

    public void setDataLanguage(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_5, this, this, pp.a.e(i10)));
        this.dataLanguage = i10;
    }

    protected abstract byte[] writeData();

    @DoNotParseDetail
    protected void writeDataLength4ccTypeCountryLanguage(ByteBuffer byteBuffer) {
        byteBuffer.putInt(getDataLength() + 16);
        byteBuffer.put(DataSchemeDataSource.SCHEME_DATA.getBytes());
        byteBuffer.putInt(this.dataType);
        IsoTypeWriter.writeUInt16(byteBuffer, this.dataCountry);
        IsoTypeWriter.writeUInt16(byteBuffer, this.dataLanguage);
    }

    static {
        ajc$preClinit();
        HashMap<String, String> map = new HashMap<>();
        language = map;
        map.put(MBridgeConstans.ENDCARD_URL_TYPE_PL, "English");
        language.put("1", "French");
        language.put(MBridgeConstans.API_REUQEST_CATEGORY_APP, "German");
        language.put("3", "Italian");
        language.put("4", "Dutch");
        language.put(CampaignEx.CLICKMODE_ON, "Swedish");
        language.put("6", "Spanish");
        language.put("7", "Danish");
        language.put("8", "Portuguese");
        language.put("9", "Norwegian");
        language.put("10", "Hebrew");
        language.put("11", "Japanese");
        language.put("12", "Arabic");
        language.put("13", "Finnish");
        language.put("14", "Greek");
        language.put("15", "Icelandic");
        language.put("16", "Maltese");
        language.put("17", "Turkish");
        language.put("18", "Croatian");
        language.put("19", "Traditional_Chinese");
        language.put("20", "Urdu");
        language.put("21", "Hindi");
        language.put("22", "Thai");
        language.put("23", "Korean");
        language.put("24", "Lithuanian");
        language.put("25", "Polish");
        language.put("26", "Hungarian");
        language.put("27", "Estonian");
        language.put("28", "Lettish");
        language.put("29", "Sami");
        language.put("30", "Faroese");
        language.put("31", "Farsi");
        language.put("32", "Russian");
        language.put("33", "Simplified_Chinese");
        language.put("34", "Flemish");
        language.put("35", "Irish");
        language.put("36", "Albanian");
        language.put("37", "Romanian");
        language.put("38", "Czech");
        language.put("39", "Slovak");
        language.put("40", "Slovenian");
        language.put("41", "Yiddish");
        language.put("42", "Serbian");
        language.put("43", "Macedonian");
        language.put("44", "Bulgarian");
        language.put("45", "Ukrainian");
        language.put("46", "Belarusian");
        language.put("47", "Uzbek");
        language.put("48", "Kazakh");
        language.put("49", "Azerbaijani");
        language.put("50", "AzerbaijanAr");
        language.put("51", "Armenian");
        language.put("52", "Georgian");
        language.put("53", "Moldavian");
        language.put("54", "Kirghiz");
        language.put("55", "Tajiki");
        language.put("56", "Turkmen");
        language.put("57", "Mongolian");
        language.put("58", NpmRNZ.lpuraTahpLSXnH);
        language.put("59", "Pashto");
        language.put("60", "Kurdish");
        language.put("61", "Kashmiri");
        language.put("62", "Sindhi");
        language.put("63", KPtaxpyICj.HguqIum);
        language.put("64", "Nepali");
        language.put("65", "Sanskrit");
        language.put("66", "Marathi");
        language.put("67", "Bengali");
        language.put("68", "Assamese");
        language.put("69", "Gujarati");
        language.put("70", "Punjabi");
        language.put("71", "Oriya");
        language.put("72", "Malayalam");
        language.put("73", "Kannada");
        language.put("74", "Tamil");
        language.put("75", "Telugu");
        language.put("76", "Sinhala");
        language.put("77", "Burmese");
        language.put("78", "Khmer");
        language.put("79", "Lao");
        language.put("80", "Vietnamese");
        language.put("81", "Indonesian");
        language.put("82", "Tagalog");
        language.put("83", "MalayRoman");
        language.put("84", "MalayArabic");
        language.put("85", "Amharic");
        language.put("87", "Galla");
        language.put("87", "Oromo");
        language.put("88", "Somali");
        language.put("89", "Swahili");
        language.put("90", "Kinyarwanda");
        language.put("91", "Rundi");
        language.put("92", "Nyanja");
        language.put("93", "Malagasy");
        language.put("94", "Esperanto");
        language.put("128", "Welsh");
        language.put("129", "Basque");
        language.put("130", "Catalan");
        language.put("131", "Latin");
        language.put(qEagQqzJZsd.GtFJetkj, "Quechua");
        language.put("133", "Guarani");
        language.put("134", "Aymara");
        language.put("135", "Tatar");
        language.put("136", "Uighur");
        language.put("137", "Dzongkha");
        language.put("138", "JavaneseRom");
        language.put("32767", "Unspecified");
    }
}
