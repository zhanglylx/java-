package 猜大小;
import 轻客户端.api;
public class zongde {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String[] user = { "1704FA3685CE6ABEA82438F4B8EB6210@qq.sohu.com", "18305058113@sohu.com",
				"494C9DB1864686068A0EF1161F7BDB67@qq.sohu.com", "15038630621@sohu.com",
				"35F598E3A798C7CE775C842DBBD3FA91@qq.sohu.com", "E0970CF6CF0A808A1C299AECB2AA548B@qq.sohu.com",
				"17075940472@sohu.com", "13990176453@sohu.com", "17099845848@sohu.com",
				"A78BD0C5D831E192DE3928872E9DD88D@qq.sohu.com", "18099335885@sohu.com",
				"3D7FDAA310FEF9974366FE57BC396706@qq.sohu.com", "o9t2luO5UVEPaRl8AIzzb1s7YO48@weixin.sohu.com",
				"13758538522@sohu.com", "17080805885@sohu.com", "B5151BE47276E8CA1BF308E7D6781CBB@qq.sohu.com",
				"13760196430@sohu.com", "o9t2luFX3IDLy4yKnIdI30vXZpz4@weixin.sohu.com",
				"6346C5639D90B556550CCBBEF065265B@qq.sohu.com", "13012982480@sohu.com", "13713020841@sohu.com",
				"18859473743@sohu.com", "13041630597@sohu.com", "8D7A8E0D9CBDB10E1C811674B3B36E35@qq.sohu.com",
				"15914841660@sohu.com", "F54B4CACC4ECB20FDE1FC4DEF638701C@qq.sohu.com",
				"AA8EAA88F3403B78265BAFD222CF1482@qq.sohu.com", "816ED3F1C28515023E761BB13459C4DC@qq.sohu.com",
				"176D8186F1FA54051997F725818319CD@qq.sohu.com", "EB1031FFA486C8DC53BB0034A2A6280B@qq.sohu.com",
				"A72D837E1C4EC06D0BB8866421041FDF@qq.sohu.com", "15146315158@sohu.com", "15055274207@sohu.com",
				"AAE0AD92A5A56F6C2B2231F6168D6173@qq.sohu.com", "8EBAD07AB5D0C92BF69CA816AEAAE221@qq.sohu.com",
				"o9t2luE--3JiZA5ca39jT972lGeQ@weixin.sohu.com", "13549371432@sohu.com",
				"0A0C47B574B4B38249E7F42971B13F0A@qq.sohu.com", "o9t2luHpHwVGPw367vu0-dDAs_vQ@weixin.sohu.com",
				"A978228F699A3552DEA9E72D9DE27EA3@qq.sohu.com", "15813496622@sohu.com", "13782180662@sohu.com",
				"15135601151@sohu.com", "17080114582@sohu.com", "D25A698D5898CE49F448C5A28BBE22D3@qq.sohu.com",
				"o9t2luNkbDz0I1yEBVBxngCJrgiA@weixin.sohu.com", "15989732802@sohu.com", "13686673865@sohu.com",
				"8630BE65DC10AA50F193CA54EF443E60@qq.sohu.com", "B4E0047304234435D351C0191B0E310F@qq.sohu.com",
				"36084E0A2E91227E3FC9F6738C896A60@qq.sohu.com", "6BFFD3E14AFA14A6C980D9962F7004BB@qq.sohu.com",
				"29E728A53EB696D16A1E6F441F45B96C@qq.sohu.com", "15031102548@sohu.com",
				"FD1596B54B3A3DA54BA78AFB4AC85176@qq.sohu.com", "17085448447@sohu.com",
				"15F10E97E3F1BA409ADC5EC95599BF44@qq.sohu.com", "5B744A73CA72A6CFCE10443BA9B46F0B@qq.sohu.com",
				"3E3E501891722BDA73891977D4E9B6FB@qq.sohu.com", "13045533735@sohu.com",
				"251D64B15A6F4B938EF720A40622B1E8@qq.sohu.com", "B1A8FE9ED9785A08031D8C87FB8B9D00@qq.sohu.com",
				"13124941504@sohu.com", "18982830996@sohu.com", "0809CF38E3FB4E02CDB4D60B3A04AE2E@qq.sohu.com",
				"17080110237@sohu.com", "15694143796@sohu.com", "8DC29EE657F26FCA6F8BA177FAB8AF41@qq.sohu.com",
				"13789568676@sohu.com", "18802647405@sohu.com", "E1C1E5A6746E415CA2687CD54E305811@qq.sohu.com",
				"17086682445@sohu.com", "0ABF7B057FF5B1CA3DC7BC47E6581789@qq.sohu.com", "15651937497@sohu.com",
				"17191796341@sohu.com", "13829521076@sohu.com", "o9t2luPLUKewf3zALrt29cVYvidA@weixin.sohu.com",
				"D95C1E2EC664985D40E833042F881539@qq.sohu.com", "B5FC577B026921C3EB030AF735F30553@qq.sohu.com",
				"DE916BFA25EA42E0DEB212C9A0C0D98F@qq.sohu.com", "13982023250@sohu.com", "18177028720@sohu.com",
				"18206699824@sohu.com", "13508149698@sohu.com", "2B67A85135503E5C4964F9CFEA7E95DA@qq.sohu.com",
				"17817938015@sohu.com", "13576165695@sohu.com", "18538328415@sohu.com",
				"84598AF58609843C2CFA58F5DA4CA2F3@qq.sohu.com", "478BD138CF89055E4735000FF07C9461@qq.sohu.com",
				"18783049725@sohu.com", "15225874321@sohu.com", "13603828274@sohu.com",
				"B017F37BBA55EF82DD57EECEF24EB723@qq.sohu.com", "5BAA2348C8554ED7BF534B1D8BCE0B44@qq.sohu.com",
				"3BD42AA7709D3FE1C3F9F8674809CBB0@qq.sohu.com", "F33CCEE713DBA05365A725B5E64B7405@qq.sohu.com",
				"13925273971@sohu.com", "15976919285@sohu.com", "17190988314@sohu.com",
				"C70BBF41A8AE3B32CA62DD3B36A2595D@qq.sohu.com", "648AC904A1DABC88FC4525CA574BB368@qq.sohu.com",
				"13512040088@sohu.com", "C12212EEFD64461D2116AFEF44CB6DD5@qq.sohu.com", "15380738506@sohu.com",
				"4E8196CBA268A8FDF0C6C58CD3C4CEC5@qq.sohu.com", "15207879021@sohu.com", "17090388004@sohu.com",
				"18077128813@sohu.com", "18224418482@sohu.com", "15292262977@sohu.com",
				"o9t2luK3XrKuADEBL_1gqepW5jlc@weixin.sohu.com", "0F86C73AFBE6AF7A6C114DA385F21264@qq.sohu.com",
				"17080831250@sohu.com", "15000505410@sohu.com", "14576613436@sohu.com",
				"15890B40A355C51769C43B66592C4AAD@qq.sohu.com", "D4E48C854E9DB052F7D43F9E123EC0FF@qq.sohu.com",
				"18745043785@sohu.com", "18318315078@sohu.com", "4447A48E42D7477F888E677CA53DF78A@qq.sohu.com",
				"13902725910@sohu.com", "17075546995@sohu.com", "D2A484999B3AB34C1967AADC015C617F@qq.sohu.com",
				"13508339178@sohu.com", "18653449863@sohu.com", "1A81F2471F3207F74AAE9DD5DEA47A2C@qq.sohu.com",
				"099AFBEEE76073FDE797E3B04ABBF8B0@qq.sohu.com", "13433387719@sohu.com",
				"o9t2luENw-i_f_dzirjQ4PTi2nGg@weixin.sohu.com", "18313621646@sohu.com",
				"o9t2luPJzbCxWBbO7Po81wyf6B-4@weixin.sohu.com", "0617AA903AA91DECB965F59B8C28F690@qq.sohu.com",
				"17082457701@sohu.com", "A72FC6CF515E9E47F2CD854C071581AA@qq.sohu.com", "13694324621@sohu.com",
				"0D52C5554A20D6389F4AA8E35B8D9DB5@qq.sohu.com", "15F922C3CFD2A935BD8EFCE288D08C14@qq.sohu.com",
				"E9B2C015DD6D515176D40F986B29BD14@qq.sohu.com", "18756171566@sohu.com",
				"o9t2luF8t9IZqQXZuskCXfXq_LyE@weixin.sohu.com", "C9EADB572A64E665069C70988DDB9389@qq.sohu.com",
				"17164302880@sohu.com", "o9t2luAKN2NjcM_WxrvGs5NdL5hg@weixin.sohu.com", "17132614749@sohu.com",
				"15710463770@sohu.com", "84F3E57FA8DBC11EB4EFE05EDECAF429@qq.sohu.com",
				"o9t2luHBJn0BMPRLvwFdlObECZN4@weixin.sohu.com", "17070800554@sohu.com",
				"50E273EEEFDB3E0A09FDE0F5C8EC8041@qq.sohu.com", "096777CCA15DB48747CECFC40EC55774@qq.sohu.com",
				"8FF385B1F435835C3D3E6A3A1644C088@qq.sohu.com", "18314142143@sohu.com", "15936781170@sohu.com",
				"13250587706@sohu.com", "18207455200@sohu.com", "17174612077@sohu.com",
				"CFF04FA4884C7B6024FFA3BD7150DB44@qq.sohu.com", "38A83B19730056D96731C111958E9CC5@qq.sohu.com",
				"8D84C860C2AE868AEFA861DE7E7172BE@qq.sohu.com", "14575732024@sohu.com", "15949811795@sohu.com",
				"18222968825@sohu.com", "o9t2luFcAnLEZ9UKbx5SigJR34ag@weixin.sohu.com", "13580700845@sohu.com",
				"15038730669@sohu.com", "DA9F702A0F7F5030E1FA7688EB0BA249@qq.sohu.com", "17070466579@sohu.com",
				"15820272198@sohu.com", "o9t2luJJq8DFNK1YI-oXZyrQ_go0@weixin.sohu.com",
				"A4BED6E2E71D5777A074BB58A2209A70@qq.sohu.com", "FF3E3792DB68CADA1D44DBB2D05CD4D8@qq.sohu.com",
				"7EF094556BB4CFD4064989E926F3E6DB@qq.sohu.com", "B8987DE0EC76E0715C8A52AD464FB6B3@qq.sohu.com",
				"15024107703@sohu.com", "8E509608447582D1D699F647F5D53E0B@qq.sohu.com",
				"AF094402E3D120F235A0B9B75AE84DBA@qq.sohu.com", "o9t2luFVnb6jEb410Bq0sbYMvRX8@weixin.sohu.com",
				"13818307451@sohu.com", "17086388109@sohu.com", "17072128399@sohu.com",
				"38B8F038CCA4FF7C989F520D52FB137B@qq.sohu.com", "FAA4152E9C9DEB11C1F05452D8CCD338@qq.sohu.com",
				"17078076514@sohu.com", "17085448146@sohu.com", "15942663061@sohu.com",
				"50D606809C71BF6A0F724512BA0BBF77@qq.sohu.com", "0A1B09856091BF306ABE16207DDBF4AF@qq.sohu.com",
				"17164508841@sohu.com", "13729949449@sohu.com", "14576606074@sohu.com", "13862780203@sohu.com",
				"17152565474@sohu.com", "8BD6D6D9F54EBA35D5A2B1324737DE0B@qq.sohu.com",
				"446F1399B774B8EF27CD96CBF4AC8E1F@qq.sohu.com", "69688A3A037535EE126E67AAABD14E52@qq.sohu.com",
				"13612679246@sohu.com", "17191628412@sohu.com", "o9t2luC_Lr_js1FcMJELMdGYaTyQ@weixin.sohu.com",
				"9212F8CD33C6D02799ACC60D0394E8EF@qq.sohu.com", "FE397A65FFC73924DDA36867CAF91A36@qq.sohu.com",
				"7DC79DCB432801990B091D2E03D520D7@qq.sohu.com", "15295400324@sohu.com",
				"655902DD7E5025A18903DEC3AAF9D796@qq.sohu.com", "FD65618BFD1CF34046B9EC17031BA8AA@qq.sohu.com",
				"15927356320@sohu.com", "7A2DEF1F3B99B148038B225162368A0F@qq.sohu.com", "15002147927@sohu.com",
				"219A67B797ABC72A998835AA57D6FD58@qq.sohu.com", "7E609D7869EA78A8FB1892A07A32CF99@qq.sohu.com",
				"17072534820@sohu.com", "AE8FB25FBCAEF7F47AA602B5AB62A1E2@qq.sohu.com",
				"o9t2luDvV07JVbIypCeULoWQqHKI@weixin.sohu.com", "18200253542@sohu.com", "13337529045@sohu.com",
				"17072534994@sohu.com", "15877270034@sohu.com", "CB3466819E7533DF0CA5F59CC648932C@qq.sohu.com",
				"4D721883C79630DD12665BB9CA1DBB70@qq.sohu.com", "82124F3BC431FD1BAF1F8B4203456FB2@qq.sohu.com",
				"9E50D659D8C4B5BF8038EAE37CA0AF2B@qq.sohu.com", "357C7FD4E8E11F524E104956F2CE2F6C@qq.sohu.com",
				"13682784276@sohu.com", "0948B7DE8CCDEB009559E0B313B930F0@qq.sohu.com",
				"o9t2luDAZM14Jug9Sd291ZT-omG8@weixin.sohu.com", "17072316565@sohu.com",
				"o9t2luNpnmM3IcyK7oa5RvW2Qs8Q@weixin.sohu.com", "15179979885@sohu.com",
				"D3166CBA7EC61E0725B3B8ECE9AC10E9@qq.sohu.com", "17182662082@sohu.com",
				"o9t2luJHF_47qXsEEe5FmeoxUZAQ@weixin.sohu.com", "099728B48923CE1C794E9D4BB45306B8@qq.sohu.com",
				"13969977536@sohu.com", "o9t2luGaDQVSI-L7gt5EGSCxKm1A@weixin.sohu.com",
				"524765399BB449CF334E8DD4117DBEF1@qq.sohu.com", "3F7D388E323AA9D9EAD51C1B093F2128@qq.sohu.com",
				"F7222BF90C0DE22F2BA1582542170059@qq.sohu.com", "AA603EA2DB58D6E03B2DC15222ED0DA2@qq.sohu.com",
				"A0A34C7CE0C43A2F8D90C4EC7C9C5C12@qq.sohu.com", "177BF1FD2DC9CEF9F6AA40FE4DFF4708@qq.sohu.com",
				"18386224582@sohu.com", "o9t2luBs_D-Ct--HVwWx4KznF21g@weixin.sohu.com",
				"34DF330FFE52676CD9E4DBF6FF5406CD@qq.sohu.com", "5C4C991332955EF31A8FBD1F2D635E16@qq.sohu.com",
				"06427D95720A6A886D72137841ED6A65@qq.sohu.com", "85EF71DC8DC6AFE3DD011A12D79699F2@qq.sohu.com",
				"17091456392@sohu.com", "o9t2luNOq3H1BOtejTy1lMFXbUY8@weixin.sohu.com",
				"BD64F3E15C57726AAAAF4BC99CF5F7C4@qq.sohu.com", "13084625065@sohu.com", "15989735809@sohu.com",
				"15589026358@sohu.com", "13270747546@sohu.com", "38F400A781D03901320704BBAB7A855F@qq.sohu.com",
				"13712104475@sohu.com", "15016170727@sohu.com", "09DD9ABE78133A58F5A9EBD4F4FC88FC@qq.sohu.com",
				"4C4C6C7905D44D2F54EE0D0678170128@qq.sohu.com", "17082474105@sohu.com", "15992239687@sohu.com",
				"17070802263@sohu.com", "13968724678@sohu.com", "AECD856A2D523F8CDE07815B5250A45C@qq.sohu.com",
				"15922120268@sohu.com", "15223047205@sohu.com", "13679533334@sohu.com",
				"DDD5CB46B148AD860D73FF70C4BE8C28@qq.sohu.com", "17191624505@sohu.com", "18873626644@sohu.com",
				"13972906605@sohu.com", "65F87B860EFE4D1B9BBF2BDBE1F07CCD@qq.sohu.com", "15707950013@sohu.com",
				"17095091464@sohu.com", "13225668184@sohu.com", "06C6C97F8201299C8AA469B0AA61A9CB@qq.sohu.com",
				"13484567329@sohu.com", "A91F1F33B58F1B73EA6F4035D78BB78F@qq.sohu.com",
				"94F3761D4C38E19FDFEFEC45582C553D@qq.sohu.com", "13501094511@sohu.com", "15222844204@sohu.com",
				"o9t2luPkzJ8UKJ_6mMkfR6_Wniz0@weixin.sohu.com", "18757695725@sohu.com", "15021580903@sohu.com",
				"13127706885@sohu.com", "51F8D9067CC65A2D7C4195F43E52F11C@qq.sohu.com",
				"179F84EF837F2971EEA03D93F564E910@qq.sohu.com", "o9t2luF0ZTa8I3Fl4RPPutLy4Ny0@weixin.sohu.com",
				"17076394719@sohu.com", "D98991467F98FA152AC1BDC6395B0F15@qq.sohu.com", "17828051624@sohu.com",
				"13292838678@sohu.com", "533FFC25F2380B4E04C34E626DAB5D99@qq.sohu.com", "15953633317@sohu.com",
				"5A1A52ECEBECEB53AAA58CF95F188E66@qq.sohu.com", "o9t2luAgs8r3nxGeB4_TfPQEKNYE@weixin.sohu.com",
				"17070563967@sohu.com", "13398994994@sohu.com", "18648653247@sohu.com", "18073613932@sohu.com",
				"4254896C4C8AB41FAC5D7BE1FDF88F25@qq.sohu.com", "18075926908@sohu.com", "14575837888@sohu.com",
				"15118392624@sohu.com" };
		while(true){
			
		}
		
	}

}
