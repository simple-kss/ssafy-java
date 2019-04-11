import java.util.StringTokenizer;

public class pars {
	public static void main(String[] args) {
		String s = "\r\n" + 
				"<dt><a href=\"javascript:fn_dictionaryView('165972-11')\">\r\n" + 
				"                <b><font color=\"#FF661F\">감정 스티커</font>,感情-,\r\n" + 
				"Emoticon sticker</b></a></dt><dd>\r\n" + 
				"\r\n" + 
				"캐릭터의 다양한\r\n" + 
				"애니메이션 동작을\r\n" + 
				"이용하여 감정을\r\n" + 
				"표현하는 그림\r\n" + 
				"문자 처리\r\n" + 
				"기술 또는\r\n" + 
				"그 캐릭터.\r\n" + 
				"정적인 감정\r\n" + 
				"\r\n" + 
				"그림 문자(이모지)에 비해 스마트폰 사용자의 감정을 보다 풍부하게 전달할 수 있다. 광대역 이동통신의 발전과 함께 이모티콘과 감정 그림 문자가 진화한 형태이다. \r\n" + 
				"애니메이션 방식은 상대방에게 발송자의 감정을 더욱 풍부하게 표현하고, 대화를 좀\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('168098-10')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">강화형 기계 학습</font>, 强化型機械學習, Reinforcement learning\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 기계 학습 중 컴퓨터가\r\n" + 
				"\r\n" + 
				"주어진 상태(state)에 대해\r\n" + 
				"\r\n" + 
				"최적의 행동(action)을 선택하는 학습 방법.\r\n" + 
				"강화형 기계 학습은 지도형/비지도형 기계 학습에 이용되는 훈련 데이터 대신, 주어진 상태에 맞춘 행동의 결과에 대한 보상(reward)을 준다. 컴퓨터는 보상을 이용하여 성능을 향상시킨다. 주로 게임이나 로봇 제어 등에 적용된다. \r\n" + 
				"예를 들어, 체스\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('168095-9')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">페이지랭크</font>, PageRank\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 인터넷 검색 엔진에서 웹사이트 검색 순위를 정하는 알고리즘. 검색된 웹사이트들 중 다른 웹사이트의 링크를 많이 받는 웹사이트가 중요할 것이라는 개념하에 구글(Google)의 창립자인\r\n" + 
				"\r\n" + 
				"래리 페이지(Larry Page)와 세르게이\r\n" + 
				"\r\n" + 
				"브린(Sergey Brin)이 개발한 알고리즘이다. PageRank는 래리 페이지의 ‘Page&#039;라는 이름을 따서 명명하였다. 검색 \r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('168096-9')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">지도형 기계 학습</font>, 指導型機械學習, Supervised learning\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 기계 학습 중 컴퓨터가 입력값과 그에 따른 출력값이 있는 데이터를 이용하여 주어진 입력에 맞는 출력을 찾는 학습 방법. 지도형 기계 학습 모델은 입력된 문제에 대한 답을 예측하는 데 사용된다. 기계 번역, 상품 추천, 질병 진단 등에 응용될 수 있다. \r\n" + 
				"학습\r\n" + 
				"\r\n" + 
				"훈련 데이터(training data)로 입력과 출력이 같이 제공되는 상황을 문제(입력)의 답(출\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('168097-9')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">비지도형 기계 학습</font>, 非指導型機械學習, Unsupervised learning\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 기계 학습 중 컴퓨터가 입력값만 있는 훈련 데이터를 이용하여 입력들의 규칙성을 찾는 학습 방법. \r\n" + 
				"비지도형 학습 모델은 사람의 해석을 통해 유용한 지식을 추출하는 데 활용되거나 지도형 기계\r\n" + 
				"\r\n" + 
				"학습(supervised learning)에서의 원래 입력보다 데이터 특징을 더 잘 표현하는 새로운 입력을 만드는 특징\r\n" + 
				"\r\n" + 
				"추출기(feature extractor)로 활용\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('167789-8')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						 	<font color=\"#FF661F\">자립형 5세대 이동 통신</font>, 自立型五世代移動通信, 5G StandAlone, 5G SA\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 5세대 이동 통신(5G) 엔알(NR: New Radio) 기반의 차세대\r\n" + 
				"\r\n" + 
				"무선 접속망(NG-RAN: Next Generation Radio Access Network)과 5G 핵심망(5GC: 5G Core network)으로 구성된 5G 이동 통신망. \r\n" + 
				"기존 설치되어 운용되는 LTE 이동 통신 시스템에서 진화하지 않고 자체 5G 시스템만으로 구성되어 이용자\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('168092-9')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						 	<font color=\"#FF661F\">차량∙사물 셀룰러 통신</font>, 車輛事物-通信, Cellular Vehicle-to-Everything, C-V2X, Cellular V2X\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 엘티이(LTE), 5G와 같은 셀룰러 이동 통신망을 통해 차량이 다른 차량이나 교통 인프라, 보행자, 네트워크 등과 정보를 서로 주고받는 차량 통신 기술. 이동 통신 표준화 기구 3GPP에서 2017년 LTE 기술을 활용한 Celluar V2X를\r\n" + 
				"\r\n" + 
				"표준으로 채택하였다(3GPP Release 14). \r\n" + 
				"\r\n" + 
				"차량이 보행자나 자전거 탑승자\r\n" + 
				"\r\n" + 
				"등 개인(pedestr\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('168093-9')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">하이브리드 빔 형성</font>, -形成, Hybrid beamforming\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 기저 대역에서 채널의 상태 정보(CSI: Channel State Information)를 토대로 디지털 빔 형성을 한 후에 무선 주파수(RF) 체인을 거쳐 아날로그 빔 형성을 하는 기술. 디지털 빔 형성을 모든 안테나에 적용하는 것에 비해 상대적으로 비용이 적게 들며 복잡도가 낮다. 경로 손실이\r\n" + 
				"\r\n" + 
				"큰 밀리미터파(millimeter wave) 대역에서 충분한\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('168094-8')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						 	<font color=\"#FF661F\">면허 대역 지원 접속</font>, 免許帶域支援接續, License Assisted Access, LAA\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 엘티이(LTE) 이동 통신망에서 기지국이 면허 대역을 주요 요소 운반파로 사용하고, 면허 불필요 대역을 보조 요소 운반파로 사용하는 운반파 묶음(CA: Carrier Aggregation) 기술. \r\n" + 
				"폭증하는 이동 통신 트래픽을 수용하기 위해 개발된 대역폭 확장 기술이다. 보조 요소 운반파(SCC) 관점에서 면허 대역을 사용하는 주요 요소 운반파(PCC)의\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('167784-7')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						 	<font color=\"#FF661F\">차세대 무선 접속망</font>, 次世代無線接續網, Next Generation Radio Access Network, NG-RAN\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 이동 통신 사실 표준화 기구 3GPP에서 제정한 5세대 이동\r\n" + 
				"\r\n" + 
				"통신 NR(New Radio) 기술 기반의 무선 접속망. \r\n" + 
				"NG-RAN은 5G NR은 물론 기존 LTE 무선 접속을 모두 수용하는 형태로 설계되어 있어, 5G NR 기지국(gNodeB) 및 LTE E-UTRA 기지국(eNodeB)으로 구성된다. \r\n" + 
				"\r\n" + 
				"5G 이동\r\n" + 
				"\r\n" + 
				"통신 시스템(5GS: 5G Sys\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('167785-8')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						 	<font color=\"#FF661F\">비자립형 5세대 이동 통신</font>, 非自立型五世代移動通信, 5G Non-Standalone, 5G NSA\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>\r\n" + 
				"\r\n" + 
				"<dd>\r\n" + 
				"					 \r\n" + 
				"						 기존의 엘티이(LTE) 이동 통신망에 5G 엔알(NR: New Radio) 기지국을 추가 연결하여 LTE 서비스에서 5G 서비스로 비교적 쉽게 진화하는 망 구조. \r\n" + 
				"5G 이동 통신의 상용화 초기에 적용할 수 있고, 서비스 이용자에게 LTE 서비스보다 향상된 서비스를 제공할 수 있다. 5G 자체적으로 동작하지 못하고 기존의 LTE 망에 의존하는 형태로, 비\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('167787-8')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						 	<font color=\"#FF661F\">다중 무선 접속 기술</font>, 多重無線接續技術, multiple Radio Access Technology, multi RAT\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 이동 통신 망에서 서로 다른 여러 무선 통신 기술을 동시에 사용하는 무선 접속 기술. \r\n" + 
				"3세대(3G) W-CDMA, 4세대(4G) LTE, 5세대(5G)\r\n" + 
				"\r\n" + 
				"NR(New Radio) 등 같은 계열의 이동 통신 기술\r\n" + 
				"\r\n" + 
				"또는 와이파이(Wi-Fi), 블루투스(Bluetooth) 등의 무선 통신 기술들이 혼재된 이종망에서 사용된다. 주어진 환경에 맞는 최적의 무선 통\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('167788-9')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						 	<font color=\"#FF661F\">이중 연결</font>, 二重連結, Dual Connectivity, DC\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 엘티이(LTE) 이동 통신에서 사용자 단말이 서로 다른 두 기지국에 연결되어, 각각의 기지국과 데이터를 동시에 송수신할 수 있는 기술. \r\n" + 
				"단말은 전송 환경에 따라 연결된 두 기지국에서 데이터를 동시에 수신하거나 하나만 선택하여 이용할 수 있는 장점이 있다. 서비스 범위가 넓으나 전송 속도가 느린 매크로셀과 서비스 범위는 좁지만 전송 속도가\r\n" + 
				"\r\n" + 
				"빠른 스몰셀(s\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('167778-8')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">모델·뷰·컨트롤러</font>, Model-View-Controller, MVC\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 소프트웨어 설계에서 세 가지 구성 요소인 모델(Model), 뷰(View), 컨트롤러(Controller)를 이용한 설계 방식. \r\n" + 
				"모델은 소프트웨어 내에서 데이터를 의미하고, 뷰는 사용자에게 보이는 화면 내용을 의미한다. 이러한 모델과 뷰의 상호 작용을 관리하는 것이 컨트롤러이다. \r\n" + 
				"예를 들어, 사용자의 입력이 컨트롤러로 들어오면 컨트롤러는 모델에서 데\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('167781-8')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">언플러그드 컴퓨팅</font>, Unplugged computing\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 교사가 학생들에게 컴퓨터 없이 컴퓨터 과학의 원리를 가르치는 학습 방법. \r\n" + 
				"‘언플러그드’란 말 그대로 컴퓨터 전원 플러그를 꽂지 않아 사용하지 않음을 의미한다. 주로 유치원생, 초등학생과 중학생을 대상으로 하며, 컴퓨터 대신 신체 활동이나 동전, 카드 등을 이용한 놀이를 통해 쉽고 재미있게 컴퓨터를 가르치는 것을 목적으로 한다. \r\n" + 
				"뉴질랜드의 컴퓨터 과학\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('167774-13')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						 	<font color=\"#FF661F\">로보틱 처리 자동화</font>, -處理自動化, Robotic Process Automation, RPA\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 업무 과정에 발생되는 데이터를 정형화하고 논리적으로 자동 수행하는 기술. \r\n" + 
				"기업의 재무, 회계, 제조, 구매, 고객 관리 등에서 데이터 수집, 입력, 비교 등과 같이 반복되는 단순 업무를 자동화하여 빠르고 정밀하게 수행한다. 경영 전반의 업무 시간을 단축하고 비용을 절감할 수 있다. \r\n" + 
				"지능형의 로봇 소프트웨어을 활용한 비즈니스 자동화 기술은 1990년대\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('166866-9')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						 	<font color=\"#FF661F\">컴퓨팅 사고</font>, -思考, Computational Thinking, CT\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 컴퓨터로 처리할 수 있는 형태로 문제와 해결책을 표현하는 사고 과정. \r\n" + 
				"컴퓨터에게 뭘 해야 할지를 사람이 설명해 주는 것이라고 볼 수 있다.  \r\n" + 
				"복잡한 문제를 컴퓨터가 효과적으로 처리할 수 있는\r\n" + 
				"\r\n" + 
				"단위로 분해(decomposition), 문제 간 유사성을 찾는\r\n" + 
				"\r\n" + 
				"패턴 인식(pattern recognition), 문제의 핵심만 추려 복잡한 문제를 단순화하는 \r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('166867-9')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						 	<font color=\"#FF661F\">진화된 범용 지상 무선 접속망</font>, 進化-汎用地上無線接續網,\r\n" + 
				"\r\n" + 
				"Evolved UMTS(Universal Mobile Telecommunications System) Terrestrial Radio Access Network, E-UTRAN,  Evolved UTRAN\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 엘티이(LTE) 이동 통신의\r\n" + 
				"\r\n" + 
				"무선 접속망(RAN: Radio Access Network). \r\n" + 
				"국제 표준화 단체인 3GPP에서 정의한 공식 명칭이다. \r\n" + 
				"일반적으로 이동 통신망은 단말에 이동 환경을 제공하는\r\n" + 
				"\r\n" + 
				"무선 접속망(RAN: Radio Access Network)과 단말 데이터를 처리하고 다른 망과의 상호 연결 등을 제공하는 핵심망(CN: Core Ne\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('166868-9')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						 	<font color=\"#FF661F\">진화된 범용 지상 무선 접속 기술</font>, 進化-汎用地上無線接續技術,\r\n" + 
				"\r\n" + 
				"Evolved UMTS(Universal Mobile Telecommunications System) Terrestrial Radio Access, E-UTRA,  Evolved UTRA\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 엘티이(LTE) 이동 통신에서\r\n" + 
				"\r\n" + 
				"무선 접속망(E-UTRAN)을 구성하는 단말과 기지국 사이의 무선 접속 기술. \r\n" + 
				"국제 표준화 단체인 3GPP에서 정의한 공식 명칭이다. \r\n" + 
				"E-UTRA의 다중 접속 방식은 하향 링크와 상향 링크가 각각 다르다. \r\n" + 
				"기지국에서 단말로 전송되는\r\n" + 
				"\r\n" + 
				"하향 링크(DL: Downlink)는 직교 주파수 분할\r\n" + 
				"\r\n" + 
				"다중 접속(OFDMA: Ort\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('166864-10')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						 	<font color=\"#FF661F\">범용 인공 지능</font>, 汎用人工知能, Artificial General Intelligence, AGI\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 특정 문제뿐 아니라 주어진 모든 상황에서 생각과 학습을 하고 창작할 수 있는 능력이 있는 인공 지능 또는 이에 대한 연구. \r\n" + 
				"인공 지능 연구의 궁극적 목표 중 하나이다. \r\n" + 
				"현재 인공 지능 연구는 음성 인식, 바둑 등 특정한 문제에 대해서는 좋은 성과를 보이고 있으나, 아직 사람과 같은 지능을 갖추지는 못하고 있다. 예를 들어, 사람과 대화하며 동시에 바\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('166863-9')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">물리 컴퓨팅</font>, 物理-, Physical computing\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 현실 세계의 아날로그 정보를 인지하여 그에 맞게 대응할 수 있도록 센서와 마이크로컨트롤러 등의 하드웨어 장치와 소프트웨어로 컴퓨팅 시스템을 만드는 것. \r\n" + 
				"넓게는 사람이 디지털 세계를 이해하고 창의적으로 활용하기 위한 프레임워크라고 볼 수 있으며, 좁게는 소프트웨어와 하드웨어 부품 등으로 기기를 직접 제작하는 것을 의미한다. 즉, 현실을 감지하고 제어하는 \r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('165971-11')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">탈중앙화 웹</font>, 脫中央化-, Decentralized web\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 웹상에서 특정 기업이나 기관이 사용자의 데이터를 독점하는 현상에 대응하여 데이터의 분산 저장과 사용자의 데이터 접근 이용 정책을 개방하는 현상을 일컫는 말. \r\n" + 
				"웹이 처음 보급될 당시, 웹은 언제 어디서나 접근 가능하고 개방하는 것을 기본 개념으로 하였다. 하지만, 최근 글로벌 웹 서비스 업체들이 대다수 사용자 데이터를 수집하여 특정 서버에 저장, 독점하고\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('165974-11')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">에지 컴퓨팅</font>, Edge computing\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 다양한 단말 기기에서 발생하는 데이터를 클라우드와 같은 중앙 집중식 데이터센터로 보내지 않고 데이터가 발생한 현장 혹은 근거리에서 실시간 처리하는 방식으로 데이터 흐름 가속화를 지원하는 컴퓨팅 방식. \r\n" + 
				"처리 가능한 대용량\r\n" + 
				"\r\n" + 
				"데이터를 발생지(소스) 주변에서 효율적으로 처리함으로써 데이터 처리 시간이 큰 폭으로 단축되고 인터넷 대역폭 사용량이 감소하는 장점이 \r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('165975-13')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">지능형 사물</font>, 知能型事物, Intelligent things\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 주변 환경에 스스로 대응하는 사물. \r\n" + 
				"빛, 열, 음, 전파 등 다양한 센서로 주변 상황을 인지하여 획득한 정보를 통신망을 통해 컴퓨터에 전달하고, 지능 정보 처리된 결과를 다시 받아 컨트롤러를 통해 스스로 주변 환경에 대응한다. 지능형 사물은 사람들이 일상적으로 사용하는 기기로 구현된다. \r\n" + 
				"지능형 사물의 대표적인 예로 자율 주행 자동차, 지능형 로봇, \r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('062281-12')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">튜링 시험</font>, -試驗, Turing test\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 컴퓨터가 지능이 있는지를 판별할 수 있는 시험. \r\n" + 
				"조사관이 블라인드 상태에서 컴퓨터와 글로 대화를 나눈 후, 대화 상대가 사람인지 컴퓨터인지 판단할 수 없게 되면 컴퓨터는 지능이 있는 것으로 튜링 시험에 합격 판정을 받는다. \r\n" + 
				"앨런\r\n" + 
				"\r\n" + 
				"튜링(Alan Turing)이 1950년 컴퓨터 지능의 운영\r\n" + 
				"\r\n" + 
				"정의(operational definition)를 위해 튜링 \r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('076384-16')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">아이엠티 2020</font>, International Mobile Telecommunications-2020, IMT-2020\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 국제 전기 통신 연합의\r\n" + 
				"\r\n" + 
				"전파 통신국(ITU-R)에서 제정한 5세대 이동 통신 표준. \r\n" + 
				"IMT-2020 표준은 주요 서비스로 이용자에게 초당 최고 20 기가비트(Gbps)의 데이터 전송 속도를 제공할 것을 규정한다. \r\n" + 
				"2015년 ITU-R 전파통신총회(RA-15)에서 2020년경 상용화를 목표로 하여 IMT-2020을 공식 용어로 채택하였다. 일반적으로 \r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('165970-11')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">중앙화 웹</font>, 中央化-, Centralized web\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 웹상의 데이터를 특정 중앙 서버에 저장하여 처리하거나 특정 기업이나 기관이 사용자의 데이터를 독점하는 현상을 일컫는 말. \r\n" + 
				"웹이 처음 개발되었을 당시, 웹의 자원은 언제 어디서나 접근이 가능하다는 것이 기본 개념이었다. 하지만 일부 글로벌 웹 서비스 업체나 국가 기관의 정책이나 환경에 의해 데이터 소유권자인 사용자가 자신의 데이터에 마음대로 접근하지 못하\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('056521-9')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">스프라이트</font>, Sprite\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>\r\n" + 
				"\r\n" + 
				"<dd>\r\n" + 
				"					 \r\n" + 
				"						 컴퓨터 그래픽스(CG)에서 장면 일부를 구성하는 2D 비트맵 이미지를 등록하고 합성하는 기능. \r\n" + 
				"1980년대 초기 비디오 게임과 비디오 영상에서 화면 전체가 아닌 개체의 움직임만 제어하는 하드웨어 기능을 지칭하는 용어였으나, 소프트웨어적인 이미지 개체의 움직임도 포함하는 것으로 의미가 확장되었다. 스크래치(Scratch)와 같은 시각적인 블록 프로그래밍에\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('062014-12')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						 	<font color=\"#FF661F\">유전 알고리즘</font>, 遺傳-, Genetic Algorithm, GA\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 진화의 핵심 원리인 자연 선택과 유전자의 개념을 이용한 최적화 기법. \r\n" + 
				"주어진 문제에 대한 해답(solution)을 무작위로 생성한 뒤 이 해답 집단을 진화시켜 좋은 해답을 찾는다. \r\n" + 
				"유전 알고리즘은 집단 기반의 최적화 기법인 진화 알고리즘의 한 종류로, 집적 회로 설계, 리보핵산(RNA: Ribonucleic acid) 구조 예측, 인공 신경망 학습 \r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('062067-11')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">하이브리드 앱</font>, Hybrid mobile application, Hybrid app\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 기본 기능은 HTML 등의 웹 문서로 구현하고, 패키징은 아이폰, 안드로이드 등 모바일\r\n" + 
				"\r\n" + 
				"운영 체제(OS)별로 구현하는 앱. \r\n" + 
				"모바일 웹과 기존 네이티브 앱의 장점을 모두 가진다. \r\n" + 
				"먼저 HTML, 종속 스타일 시트(CSS: Cascading Style Sheets), 자바스크립트(JavaScript) 등 웹 표준 기술을 사용하여 웹 페이지를 구현하고, \r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('040402-12')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">데이터 채굴</font>, -採掘, Data mining\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 인공 지능 기법을 이용하여 대용량의 데이터에서 의미 있는 통계적 패턴이나 규칙, 관계를 찾아내 분석함으로써 유용하고 활용 가능한 정보를 추출하는 기술. \r\n" + 
				"지하에 묻힌 광물을 찾아낸다는 뜻의 채굴(mining)을 데이터 분석의 용어로 사용하게 된 이유는 탄광에서 석탄을 캐거나 대륙붕에서 원유를 채굴하는 작업처럼 데이터에서 숨겨진 가치를 찾아낸다는 동일한 특\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('049155-10')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">모바일 백홀망</font>, -網, Mobile backhaul network\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 이동 통신망에서 기지국과 핵심망을 연결하는 망. \r\n" + 
				"엘티이(LTE: Long Term Evolution)와 5세대(5G) 엔알(NR: New Radio) 등에서 사용자 단말(UE: User Equipment)의 데이터를\r\n" + 
				"\r\n" + 
				"기지국(LTE의 eNodeB, 5G NR의 gNodeB)과 핵심망(LTE의 EPC 또는 5G NR의 5GC) 사이에 전달한다. \r\n" + 
				"이동 통\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('054426-11')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">반응형 웹</font>, 反應型-, Responsive web\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 단말의 종류와 화면 크기에 실시간 반응하여 웹 페이지를 최적화된 화면 구성으로 보여주는 웹. \r\n" + 
				"스마트폰 같은 모바일 단말의 이용량이 늘면서 데스크톱 위주의 기존 웹 사이트가 작은 화면에는 적당하지 않아 웹 페이지를 사용자의 화면 크기에 자동으로 맞춰 보여주는 기술이 필요하게 되었다. \r\n" + 
				"반응형 웹 구현에 사용되는 대표적인 기술은 종속 스타일 시트 3 버전\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('055996-10')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">스마트 팜</font>, Smart farm\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 농·림·축·수산물의 생산, 가공, 유통 단계에서 정보\r\n" + 
				"\r\n" + 
				"통신 기술(ICT)을 접목하여 지능화된 농업 시스템. \r\n" + 
				"사물 인터넷, 빅데이터, 인공 지능 등의 기술을 이용하여 농작물, 가축 및 수산물 등의 생육 환경을 적정하게 유지·관리하고, PC와 스마트폰 등으로 원격에서 자동 관리할 수 있어, 생산의 효율성뿐만 아니라 편리성도 높일 수 있다.  \r\n" + 
				"ICT 기술\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('039537-9')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">커넥티드 카</font>, Connected car\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 통신망에 연결된 자동차. \r\n" + 
				"통신\r\n" + 
				"\r\n" + 
				"수단으로 무선랜(Wi-Fi), 엘티이(LTE) 이동 통신 등이 사용된다. 커넥티드 카는 다른 차량이나 교통 및 통신 인프라, 보행자 단말 등과 실시간으로 통신하며 운전자의 편의와 교통 안전을 돕고 인터넷의 다양한 서비스를 제공한다. 커넥티드 카 자체가 통신 기기가 된다는 의미에서 ‘거대한 사물 인터넷(IoT) 기기’라고도 \r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('036162-13')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						 	<font color=\"#FF661F\">인공 지능</font>, 人工知能, Artificial Intelligence, AI\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 컴퓨터로 구현한 지능 또는 이와 관련한 전산학의 연구 분야. \r\n" + 
				"인공 지능은 사람 또는 동물의 지능이 컴퓨터로 모사될 정도로 세밀하고 정확하게 표현될 수 있다는 생각에 기반을 둔다. 지능에 대한 정의와 마찬가지로 인공 지능에 대해서도 다양한 정의가 존재한다. 인공 지능의 방법과 관련된 탐색, 논리 및 추론, 지식 표현, 계획, 학습 등 세부 분야에 대한 연\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('037986-15')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						 	<font color=\"#FF661F\">운반파 묶음</font>, 運搬波-, Carrier Aggregation, CA\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 3GPP에서 제정한 기술로 데이터 속도를 증가시키기 위해 서로 다른 운반파를 묶어서 광대역으로 전송하는 기술. \r\n" + 
				"단말은 넓은 주파수 대역폭을 사용함으로써 빠르게 전송 속도를 높일 수 있다. \r\n" + 
				"\r\n" + 
				"이동 통신 국제 표준화 단체인 3GPP에서 제정한\r\n" + 
				"\r\n" + 
				"엘티이 어드밴스트(LTE-Advanced)\r\n" + 
				"\r\n" + 
				"표준 릴리즈(release) 10에서 핵심 기술로 처음 소개되었다.\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('038399-10')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">챗봇</font>, Chatbot\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 \r\n" + 
				"문자 또는 음성으로 대화하는 기능이 있는 컴퓨터 프로그램 또는 인공 지능. \r\n" + 
				"사람처럼 자연스러운 대화를 진행하기 위해\r\n" + 
				"\r\n" + 
				"단어나 구(句)의 매칭만을 이용하는 단순한 챗봇부터 복잡하고 정교한 자연어 처리 기술을 적용한 챗봇까지 수준이\r\n" + 
				"\r\n" + 
				"다양하다. 챗봇은 채터봇(chatterbot), 토크봇(talkbot) 등의 이름으로도 불린다. \r\n" + 
				"초창기 웹 검색 엔진 중 \r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('035793-9')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						 	<font color=\"#FF661F\">지능형 환경</font>, 知能型環境, Ambient Intelligence, AmI\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 사람과 다양한 전자 기기 간의 실시간 상호 작용으로 만들어지는 지능화된 서비스 환경. \r\n" + 
				"주위 환경을 의미하는 ‘앰비언트’와 지능을 뜻하는 ‘인텔리전스’가 결합한 말로, 주변 환경이 사람을 인식하고 사람이 원하는 시간 및 장소에서 사람이 원하는 서비스를 맞춤형으로 제공하고 희망 사항을 예측함을 의미한다. 미래에는 전자 기기가 특별히 눈에 띄지 않고 마치 배\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('035230-10')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">추상화</font>, 抽象化, Abstraction\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 컴퓨터 과학 분야에서 주어진 문제나 시스템의 복잡도를 단순화하여 인식하기 쉽게 만드는 개념화 작업. \r\n" + 
				"핵심 요소를 잘 파악하여 필요 이상으로 상세, 복잡한 요소들을 결합하거나 단순화하고, 속성의 일부분만으로 주어진 대상을 간결하고 명확하게 표현한다. 복잡도를 관리하는 핵심 기술이라고 할 수 있다. \r\n" + 
				"방식에 따라 데이터\r\n" + 
				"\r\n" + 
				"추상화(data abstractio\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('081014-5')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						 	<font color=\"#FF661F\">협대역 사물 인터넷</font>, 狹帶域事物-, NarrowBand-Internet of Things, NB-IoT\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 엘티이(LTE) 기술 기반으로 사물 인터넷을 효율적으로 제공하는 저전력 광역 통신 표준 기술. \r\n" + 
				"2016년 3GPP 이동 통신 표준화 기구에서 제정하였다. 180kHz의 좁은 대역으로 최대 250kbps의 데이터 전송 속도와 10km 이상의 광역 서비스를 지원하고, 이동성은 지원하지 않는다. 수도·가스·온도·전기 등 검침 센서, 스마트 조명, 위치 추적 \r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('105333-10')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						 	<font color=\"#FF661F\">향상된 모바일 브로드밴드</font>, 向上-, enhanced Mobile BroadBand, eMBB\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 5세대 이동 통신에서 사용자가 체감하는 대용량 데이터 전송 속도가 기존 모바일 브로드밴드보다 빠른 서비스. \r\n" + 
				"ITU-R에서 정한 IMT-2020(5G) 이동 통신의 주요 서비스\r\n" + 
				"\r\n" + 
				"요건(usage scenario) 중 하나이다. 기존 4세대(LTE)의 모바일 브로드밴드(MBB) 서비스 품질을 향상시켜 데이터 다운로드의 최고 전송 속도가 10 ~ 20 기가비트\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('047016-8')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">제이슨</font>, JavaScript Object Notation, JSON\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 웹과 컴퓨터 프로그램에서 용량이 적은 데이터를 교환하기 위해 데이터 객체를 속성·값의 쌍 형태로 표현하는 형식. \r\n" + 
				"자바스크립트(JavaScript) 토대로 개발되었다. 여러 프로그래밍 언어에도 사용할 수 있어 독립형 언어이며 텍스트로 기술하여 사람도 쉽게 읽고 작성할 수 있다. 웹 브라우저와 웹 서버 간 비동기 통신, 웹 서버 간의 데이터 교환 등에 주로\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('048251-3')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">기존 시스템</font>, 旣存-, Legacy system\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 새로운 시스템과 구별하여 기존 시스템을 일컫는 말. \r\n" + 
				"새로 제안된 방식이나 기술 등을 부각하는 의미로 사용된다. 과거에 개발되어 현재까지 계속 사용되는 기술, 데이터, 플랫폼, 소프트웨어 및 하드웨어 등을 총칭한다. 현재 사용하지 않지만 새로운 시스템에 영향을 주는 경우도 포함한다. \r\n" + 
				"기존(레거시) 시스템은 구형 컴퓨터나 서버와 같은 하드웨어부터, 현재\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('049162-4')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">모바일 브로드밴드</font>, Mobile BroadBand, MBB\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 스마트폰, 태블릿PC 등 모바일 기기에 멀티미디어 인터넷 서비스를 고속으로 제공하는 기술. \r\n" + 
				"고속\r\n" + 
				"\r\n" + 
				"패킷 접속(HSPA: High Speed Packet Access), HSPA+(evolved HSPA), 엘티이(LTE),\r\n" + 
				"\r\n" + 
				"엘티이 어드밴스드(LTE-Advanced) 등 3.5세대부터 4세대까지의 이동 통신 기술과\r\n" + 
				"\r\n" + 
				"모바일 와이맥스(Mobile WiMAX),\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('059151-4')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						 	<font color=\"#FF661F\">유니코드 변환 형식</font>, -變換形式, Unicode Transformation Format, UTF\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 유니코드 문자를 기존 문자 체계와의 상호 호환을 위해 가변 길이의 바이트열 값으로 인코딩하는 방식. 유니코드(Unicode)는 전 세계의 거의 모든 문자에 고유 숫자를 부여한 문자 집합으로, 1993년 국제 표준(ISO/IEC 10646)으로 제정되었다. 유니코드는 기본적으로 2 바이트로 한 문자를 표현하여, 기존 7 비트 또는 8 비트로 한 문자를 표현하\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('168086-2')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">타입스크립트</font>, TypeScript\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 웹 클라이언트와 서버 프로그램 개발에 모두 사용되는 오픈 소스 프로그래밍 언어.  마이크로소프트(Microsoft)에서 개발하였다. 자바스크립트(JavaScript)의 상위 언어로, 앵귤러제이에스(AngularJS), 리액트제이에스(ReactJS), 노드닷제이에스(Node.js) 등의 자바스크립트 기반 프로그램은 타입스크립트 프로그램으로도 동작한다. \r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('168088-2')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						 	<font color=\"#FF661F\">하이퍼텍스트 전송 규약 2.0</font>, -轉送規約-, HyperText Transfer Protocol Version 2.0, HTTP/2\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 웹 콘텐츠의 전송 속도를 높이고 보안을 강화한 하이퍼텍스트 전송 규약 2.0 버전. \r\n" + 
				"\r\n" + 
				"웹이 복잡한 응용 개발을 위한 플랫폼 기술로 발전하면서 요구되는 성능 최적화에 목적을 두고 개발되었다. \r\n" + 
				"바이너리 기반의 프레이밍\r\n" + 
				"\r\n" + 
				"전송 계층(binary framing layer), 서버 푸시, 헤더 압축, 요청 및 응답 다중화, 전송\r\n" + 
				"\r\n" + 
				"계층 보안(TLS: Trans\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('168087-2')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">서비스 워커</font>, Service worker\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 웹 브라우저가 실행하지 않는 상태에서도 브라우저의 고유 기능을 백그라운드로 실행할 수 있는 스크립트. 기존 웹 스크립트(자바스크립트)는 브라우저\r\n" + 
				"\r\n" + 
				"사용자 인터페이스(UI)와 상호 작용을 하면서 실행하나,\r\n" + 
				"\r\n" + 
				"서비스 워커(Service worker) 스크립트는 브라우저 UI 또는 웹 페이지와 별개로 백그라운드에서 실행한다. 인터넷 연결이 되지 않는 오프라인 환경에\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('168089-2')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						 	<font color=\"#FF661F\">연계 데이터용 제이슨</font>, 連繫-用-, JavaScript Object Notation for Linked Data, JSON-LD\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 웹에서 용량이 적은 링크드\r\n" + 
				"\r\n" + 
				"데이터(linked data)를 교환하기\r\n" + 
				"\r\n" + 
				"위해 제이슨(JSON) 기반으로 연계 데이터의 의미를 표현하고 서비스 간 연동을 제공하는 데이터 표현 형식. \r\n" + 
				"텍스트\r\n" + 
				"\r\n" + 
				"형식의 제이슨(JSON: JavaScript Object Notation) 데이터 교환 형식을 사용하여, 사람이 읽고 작성하기 쉽다. 링크된 데이터를 기반으로 데이터 객체\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('168090-2')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">엔진엑스</font>, Nginx\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 웹 서버용 오픈 소스 소프트웨어. 엔진엑스(Nginx)가 제공하는 각 기능은 모듈화되어 있어 효율적인 운영을 할 수 있고, 아파치(Apache) 웹 서버 소프트웨어보다 메모리 사용이 효율적이며 클라이언트 처리 속도가 더 빠르다. \r\n" + 
				"\r\n" + 
				"러시아의 프로그램 개발자인\r\n" + 
				"\r\n" + 
				"이고르 시쇼브(Igor Sysoev)가 개발하여 2004년 발표하였다. \r\n" + 
				"\r\n" + 
				"웹 서버 소프트웨\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('168091-3')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">브로드밴드</font>, Broadband\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 대량의 정보를 고속으로 전송하는 유무선 정보 통신 시스템 또는 서비스. \r\n" + 
				"\r\n" + 
				"통신망에서는 동축 케이블이나 광섬유, 무선 등 광대역 매체를 여러 주파수 채널로 다중화하여 정보를 전송하는 의미로 사용한다. 일반적으로 케이블 모뎀, 디지털 가입자 회선(DSL: Digital Subscriber Line), 와이파이(Wi-Fi), 와이맥스(WiMax), 3세대(\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('167779-6')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">리액트제이에스</font>, ReactJS\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 단일 웹 페이지나 모바일 앱에서 사용자 인터페이스 중 화면에 표시되는 뷰 부분의 개발에 사용되는 자바스크립트 라이브러리. \r\n" + 
				"페이스북(Facebook)에서 개발하여 2013년 처음 배포하였고, 공개 소스이다. 모델·뷰·컨트롤러(MVC: Model-View-Controller) 개발 요소\r\n" + 
				"\r\n" + 
				"중 뷰(view)만 제공하며, 기존의 웹 기술 HTML, CSS 등과 \r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('167790-3')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">큐알코드 지급 결제</font>, -支給決濟, QR Code payment\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 QR코드를 활용한 간편 지급 결제 서비스. \r\n" + 
				"QR코드 리더기, 모바일 앱 등으로 QR코드를 스캔하면 결제를 할 수 있으며, 온라인과 오프라인에서 모두 활용된다. QR코드에는 판매자 정보와 계좌 정보, 거래 내역 등의 정보가 담겨 있다. \r\n" + 
				"카드 결제 단말기와 같은 별도의 장비가 필요 없고 판매자와 소비자 모두 스마트폰만 있으면 결제가 가능하다. 소비자가 \r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('167780-2')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">앵귤러제이에스</font>, AngularJS\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 웹 애플리케이션 개발에 사용되는 자바스크립트 프레임워크. \r\n" + 
				"모델·뷰·컨트롤러(MVC: Model-View-Controller) 개발 방식을 지원하여 웹 애플리케이션 개발 시 소스 코드 구현 시간이 단축되고, 코드를 재사용할 수 있으며 유지보수의 효율성이 향상된다. 구글(Google)사에서 개발하였으며, 공개 소스이다. 2010년 처음 배포되었다. \r\n" + 
				"웹 \r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('167775-1')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">웹 지급 결제</font>, -支給決濟, Web payments\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 웹에서 신용카드, 현금카드 등 다양한 지급 결제 수단을 사용하여 지급 처리를 제공하는 기능에 대한 총칭. \r\n" + 
				"월드와이드웹(W3C) 표준화 기구에서 웹 지급 결제 표준을 개발하고 있다. \r\n" + 
				"웹상에서의 결제 처리 방식은 웹 사이트별로 결제 처리 방법이 상이하여 같은 정보를  반복 입력하거나, 결제 완료까지 복잡한 단계를 거쳐야 하는 경우가 많다. 모바일 웹상에\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('167776-1')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">웹 국제화</font>, -國際化, Web Internationalization\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 다양한 국제 언어 문화 환경을 수용할 수 있도록 웹 콘텐츠나 서비스, 웹 표준 등을 설계하고 개발하는 것. \r\n" + 
				"특정 소수의 언어나 문화권 이용자도 영어권의 이용자와 동일한 수준으로 웹 서비스를 이용할 수 있도록 하기 위한 것이\r\n" + 
				"\r\n" + 
				"목적이다. 월드와이드웹 컨소시엄(W3C)은 웹 국제화를 고려하여 HTML, CSS 등 웹 표준화를 진행한다. \r\n" + 
				"전 세계의 모든 사\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('167777-1')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">프로그레시브 웹 앱</font>, Progressive Web App\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 인터넷이 연결되지 않아도 웹 브라우저에서 이용할 수 있고 모바일 앱의 푸시 알림 기능 등을 지원하는 애플리케이션. \r\n" + 
				"웹과 다운로드형의 모바일 앱의 장점을 이용했다는 면에서 하이브리드 앱과 유사하지만, 하이브리드 앱은\r\n" + 
				"\r\n" + 
				"앱 마켓(스토어)에서 다운받아 설치한 후 사용하는 반면, 프로그레시브 웹 앱은 브라우저에서 바로 사용한다. \r\n" + 
				"기존의 웹 앱은 인터넷에 연결\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('167782-1')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">카렐 프로그래밍 언어</font>, -言語, Karel programming language\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 컴퓨터 프로그래밍 초보자를 위한 교육용 프로그래밍 언어. \r\n" + 
				"격자(그리드) 구조에서 카렐이라는 작은 로봇을 좌우(수평) 상하(수직) 방향 이동, 90도 회전, 소리를\r\n" + 
				"\r\n" + 
				"내는 비퍼(beeper)를 잡거나 놓기 등의 단순 명령으로 제어하는 프로그램을 작성할 수 있다.  \r\n" + 
				"미국의\r\n" + 
				"\r\n" + 
				"리처드 패티스(Richard E. Pattis) 교수가 만들었으며, 1981년 저술\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('167783-1')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						 	<font color=\"#FF661F\">신경망 기계 번역</font>, 神經網機械飜譯, Neural Machine Translation, NMT\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 원문 번역의 전 과정을 인공 신경망으로 처리하는 기계 번역. \r\n" + 
				"주로\r\n" + 
				"\r\n" + 
				"심층 신경망(DNN: Deep Neural Network)을 사용한다. \r\n" + 
				"전통적으로 기계 번역에는 단어 사전과 번역 규칙을 이용하는 규칙 기반 기계 번역(RBMT: Rule-Based Machine Translation)과 원문과 해당 번역문에 대한 대량의 말뭉치(corpus) 데이터를\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('167786-1')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">지노드비</font>, next generation Node B, gNodeB, gNB\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 이동 통신 사실 표준화 기구 3GPP에서 제정한 5세대 이동\r\n" + 
				"\r\n" + 
				"통신 NR(New Radio)  기지국. \r\n" + 
				"\r\n" + 
				"3GPP에서 사용하는 공식 명칭이다. 3GPP에서 기존 4세대(4G) 이동 통신의 LTE 기지국의\r\n" + 
				"\r\n" + 
				"이름 이노드비(eNodB)와 구별하여 5G NR(New Radio) 기지국을 ‘다음 세대(next generation)’의 알파벳 ‘g’를 인용하여 gN\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('060042-2')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						 	<font color=\"#FF661F\">웹 운영 체제</font>, -運營體制, Web Operating System, Web OS, WOS\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 웹 표준 기술 기반의 소프트웨어 개발 인터페이스를 제공하는 운영 체제. \r\n" + 
				"표준을 따르므로 소프트웨어의 상호 호환성이 우수하고, 기기의 제조사별 특성이나 기술 사양에 영향 받지 않는다. PC, 스마트폰, 태블릿PC 등의 컴퓨팅 기기와 웹 서비스만을 위한 클라우드 단말, 스마트 TV, 냉장고 등의 스마트 가전제품에 사용된다. 대표적인 웹 운영 체제로 크롬 O\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('062475-3')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">스리지피피</font>, 3rd Generation Partnership Project, 3GPP\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 이동 통신 표준을 제정하는 사실 표준화 기구. \r\n" + 
				"3세대 이동 통신 시스템인 IMT-2000 표준인 광대역 부호 분할\r\n" + 
				"\r\n" + 
				"다중 접속(WCDMA: Wideband CDMA) 표준을 개발하기 위해 1998년 유럽 전기 통신\r\n" + 
				"\r\n" + 
				"표준 협회(ETSI)를 중심으로\r\n" + 
				"\r\n" + 
				"일본 전파산업회(ARIB)와 정보통신기술위원회(TTC), 중국통신표준협회(CCSA),\r\n" + 
				"\r\n" + 
				"미국 정보통신표준협회(AT\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('105332-8')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						 	<font color=\"#FF661F\">초고신뢰∙저지연 통신</font>, 超高信賴低遲延通信, Ultra-Reliable and Low Latency Communications, URLLC\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 5세대 이동 통신(5G) 망에서 데이터 전송의 신뢰도가 매우 높고 지연 시간이 매우 짧은 통신. 이동 통신 국제 표준 IMT-2020의 사용 시나리오 중 하나이며, 자율 주행 자동차, 공장 자동화, 가상 현실 및 증강 현실, 원격 진료 등과 같은 서비스에 필요하다. \r\n" + 
				"IMT-2020 표준에서 URLLC의 기술 성능 요건으로 1 밀리초(ms) 이하의 지연 \r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('049996-2')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						 	<font color=\"#FF661F\">자연어 처리</font>, 自然語處理, Natural Language Processing, NLP\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 컴퓨터를 이용해 사람의 자연어를 분석하고 처리하는 기술. \r\n" + 
				"요소 기술로 자연어 분석, 이해, 생성 등이 있으며, 정보 검색, 기계 번역, 질의응답 등 다양한 분야에 응용된다. \r\n" + 
				"자연어는 일반 사회에서 자연히 발생하여 사람이 의사소통에 사용하는 언어로, 컴퓨터에서 사용하는 프로그래밍 언어와 같이 사람이 의도적으로\r\n" + 
				"\r\n" + 
				"만든 인공어(constructed lang\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('050917-4')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">온톨로지</font>, Ontology\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 존재하는 사물과 사물 간의 관계 및 여러 개념을 컴퓨터가 처리할 수 있는 형태로 표현하는 것. \r\n" + 
				"어떤 일정 범위에서 사용되는 단어들의 개념, 특성, 연관 관계 등을 표현하여 단어에 대한 일반적 지식이 명시적으로 드러나고, 단어 간 관계 정의를 통해 문장의 의미를 파악할 수 있다. 스탠포드 대학의 그루버(Thomas A. Gruber) 교수는 온톨로지를 ‘\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('050918-5')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						 	<font color=\"#FF661F\">웹 온톨로지 언어</font>, -言語, Web Ontology Language, OWL\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 웹에서 표현되는 다양한 어휘 정보를 여러 웹 응용 프로그램들이 재활용할 수 있도록 지원하는 온톨로지 저작용 언어. \r\n" + 
				"웹 분야에서는 온톨로지의 사물(thing) 중에서 어휘를 대상으로 하여, 웹 형식의 문서와 웹 응용 프로그램에서 어휘, 어휘 그룹, 어휘 관계를 논리적으로 풍부하고 유연하게 기술할 수 있는 장점이 있다. \r\n" + 
				"월드와이드웹(W3C) 표준화 기구\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('042931-4')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">이노드비</font>, evolved Node B, E-UTRAN Node B, eNodeB, eNB\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 엘티이(LTE: Long Term Evolution) 이동 통신 기지국. \r\n" + 
				"이동 통신 사실 표준화 기구 3GPP에서 사용하는 공식 명칭이다.  3GPP는 기존 3세대(3G) 이동 통신 기지국의 이름 ‘Node B’와 구별하여 LTE의 무선 접속망 E-UTRAN(Evolved UTRAN) 기지국을 ‘E-UTRAN Node B’ 또는 ‘evolved Node \r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('045398-4')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						 	<font color=\"#FF661F\">하이퍼텍스트 보안 전송 프로토콜</font>, -保安轉送-, HyperText Transfer Protocol Secure, HTTPS\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 웹 클라이언트인 브라우저와 서버 간의 안전한 통신을 지원하기 위해 HTTP의 전송 계층에 암호 통신 규약을 적용한 웹 표준 기술. \r\n" + 
				"암호 규약으로 전송\r\n" + 
				"\r\n" + 
				"계층 보안(TLS: Transport Layer Security)이 사용되며, 정보 불법 도청이나 변조 등을 방지하여 안전하고 신뢰가 가는 통신을 제공한다. \r\n" + 
				"HTTPS의 기본 목적은 웹 사이트 접근 인\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('047284-2')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						 	<font color=\"#FF661F\">지식 기반 시스템</font>, 知識基盤-, Knowledge-Based Systems, KBS\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 특정 분야의 전문 지식으로 구성된 지식\r\n" + 
				"\r\n" + 
				"베이스(knowledge base)에 기초한 추론으로 복잡한 문제를 해결하는 컴퓨터 시스템.  \r\n" + 
				"지식 기반 시스템은\r\n" + 
				"\r\n" + 
				"인공 지능(AI) 초창기에 개발되었던 간단한 탐색 기반 기술의 한계인 영역\r\n" + 
				"\r\n" + 
				"지식(domain knowledge)과 계산 능력의 부족을 극복하기 위해 제안되었다. 대표적인 지식\r\n" + 
				"\r\n" + 
				"기반 시스템(KBS)의 예\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('166871-4')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						 	<font color=\"#FF661F\">고정 무선 접속</font>, 固定無線接續, Fixed Wireless Access, FWA\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 고정된 가입자의 단말과 망 접속점인 기지국을 무선으로 연결하여 초고속 인터넷 서비스를 제공하는 무선 통신 기술. \r\n" + 
				"주로 건물 외부에 설치되는 가입자 단말과 기지국 사이는 광케이블 같은 유선으로 연결되는 것이 일반적인데, 유선 구간 일부를 광대역 무선 통신으로 대체하여 초고속 인터넷 환경을 제공한다. \r\n" + 
				"최근 이동 통신 기술 발전으로 5G 이동 통신과 비슷\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('035409-5')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">액티브엑스</font>, ActiveX\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>\r\n" + 
				"\r\n" + 
				"<dd>\r\n" + 
				"					 \r\n" + 
				"						 마이크로소프트 윈도우(Microsoft Windows) 환경에서 응용 프로그램이나 웹 브라우저가 인터넷을 통해 추가 기능을 다운로드 및 실행할 수 있도록 지원하는 소프트웨어 프레임워크. \r\n" + 
				"대표적인 예로 공인인증서가 있다. \r\n" + 
				"마이크로소프트사에서 1996년 응용 프로그램과 웹 페이지 개발에 재사용할 수 있는 소프트웨어 컴포넌트를 정의하기 위해 만들었다. \r\n" + 
				"\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('036168-7')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						 	<font color=\"#FF661F\">인공 신경망</font>, 人工神經網, Artificial Neural Network, ANN\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 사람 또는 동물 두뇌의 신경망에 착안하여 구현된 컴퓨팅 시스템의 총칭. \r\n" + 
				"기계\r\n" + 
				"\r\n" + 
				"학습(machine learning)의 세부 방법론 중 하나로, 신경 세포인 뉴런(neuron)이 여러 개 연결된 망의 형태이다. 구조 및 기능에 따라 여러 종류로 구분되며, 가장 일반적인 인공 신경망은 한 개의 입력층과 출력층 사이에 다수의\r\n" + 
				"\r\n" + 
				"은닉층(hidden layer)이 \r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('036688-4')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">백홀</font>, Backhaul\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 다수의 통신망을 통해 데이터를 전송하는 계층적 구조로 된 통신망에서 주변부\r\n" + 
				"\r\n" + 
				"망(edge network)을 기간\r\n" + 
				"\r\n" + 
				"망(backbone network)이나 인터넷에 연결시키는 링크. \r\n" + 
				"백홀은 물리적으로 광케이블, 구리선, 무선 등으로 연결된다. 무선(wireless)을 사용하는 백홀인 경우, 음성 트래픽 위주 서비스에서는 T1/E1 급의 백홀 링크가 사용되었으\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('059997-6')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">웹 2.0</font>, Web 2.0\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 일방적 서비스 형태의 초기 웹과 비교하여 기술적인 진보보다는 웹 서비스의 사용성을 대폭 개선하여 누구나 웹에 쉽고 편리하게 참여 및 정보를 공유하고 협력할 수 있도록 진화한 웹 환경. \r\n" + 
				"웹 2.0의 출현으로 산업 전 분야의 응용 및 서비스에서 웹이 표준적인 사용자 인터페이스로 빠르게 확대 적용되었다. \r\n" + 
				"월드\r\n" + 
				"\r\n" + 
				"와이드 웹(WWW: World Wide Web\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('054405-7')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						 	<font color=\"#FF661F\">자원 기술 프레임워크 속성</font>, 資源記述-屬性, Resource Description Framework in attributes, RDFa\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 HTML, XHTML, XML 기반의 웹 문서에서 태그가 감싸고 있는 데이터의 의미 정보를 추가로 나타내기 위해 태그 내 속성을 확장한 웹 표준. \r\n" + 
				"국제 웹 표준화 기구인 월드 와이드 웹 컨소시엄(W3C: World Wide Web Consortium)에서 제정하였다. \r\n" + 
				"\r\n" + 
				"기존 웹 문서에서는 특정 태그 안에 삽입된 데이터가 어떤 뜻을 담고 있는지를 표\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('060078-6')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						 	<font color=\"#FF661F\">웹 기반 그래픽스 라이브러리</font>, -基盤-, Web-based Graphics Library, WebGL\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>\r\n" + 
				"\r\n" + 
				"<dd>\r\n" + 
				"					 \r\n" + 
				"						 웹의 삼차원(3D) 컴퓨터 그래픽스 표현 기능을 제공하는 내장형 자바스크립트 라이브러리. \r\n" + 
				"구글\r\n" + 
				"\r\n" + 
				"크롬(Google Chrome),\r\n" + 
				"\r\n" + 
				"애플 사파리(Apple Safari),\r\n" + 
				"\r\n" + 
				"모질라 파이어폭스(Mozilla Firefox) 등 모든 웹 브라우저 환경에서 사용될 수 있고 저작권이 없는 웹 표준이다. 약어 ‘웹지엘(WebGL)&#039;로 주로 사용하며 크로노스 그룹(Kh\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('040679-4')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">심층 기계 학습</font>, 深層機械學習, Deep learning\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 일반적인 기계 학습 모델보다 더 깊은 신경망 계층 구조를 이용하는 기계 학습. \r\n" + 
				"주로 여러 개의\r\n" + 
				"\r\n" + 
				"은닉층(hidden layer)으로 구성된 인공 신경망을 활용한다. 은닉층 수가 많아질수록 ‘깊다(deep)’라고 표현하며, 깊은 계층 구조는 얕은 구조에 비해 복잡한 함수를 효율적으로 표현할 수 있다. 심층 기계\r\n" + 
				"\r\n" + 
				"학습(deep learning)은 문제를 해결\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('105334-7')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						 	<font color=\"#FF661F\">대규모 사물 통신</font>, 大規模事物通信, massive Machine Type Communications, mMTC\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 IMT-2020(5G) 이동통신에서 다수의 기기가 서로 연결되어 정보를 주고받는 사물 통신을 일컫는 명칭. IMT-2020(5G) 이동통신의 주요\r\n" + 
				"\r\n" + 
				"서비스 요건(usage scenario) 중 하나이며,  비교적 저용량의 데이터를 저속으로 주고받는 사물 통신 기기를 대상으로 한다. \r\n" + 
				"mMTC 서비스를 위해 ITU-R은 사물 통신 기기의 수(connection\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('137416-4')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						 	<font color=\"#FF661F\">디지털 전환</font>, -轉換, Digital Transformation, DX\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 디지털 기술을 사회 전반에 적용하여 전통적인 사회 구조를 혁신시키는 것. \r\n" + 
				"일반적으로 기업에서 사물 인터넷(IoT), 클라우드 컴퓨팅, 인공지능(AI), 빅데이터 솔루션\r\n" + 
				"\r\n" + 
				"등 정보통신기술(ICT)을 플랫폼으로 구축·활용하여 기존 전통적인 운영 방식과 서비스 등을 혁신하는 것을 의미한다. \r\n" + 
				"IBM\r\n" + 
				"\r\n" + 
				"기업가치연구소의 보고서(2011)는 ‘기업이 디지털과 물리적인\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('137417-6')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">데이터 통합 관리</font>, -統合管理, Data Governance\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 기업에서 가치 있는 양질의 데이터를 지속적으로 발굴·관리하여 비즈니스 자산으로 활용하기 위한 데이터 통합 관리 체계.\r\n" + 
				"ICT 발전에 따라 기업 내 데이터양이 급증하고 정보 시스템도 분산되면서 데이터가 효과적으로 통합 관리되지 않아 사용되지 않는 다크 데이터가 많아졌다. \r\n" + 
				"데이터 관리 소홀로 인한 정보 노출과 관리 비용을 줄이고, 고품질의 데이터를 발굴하여\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('137419-3')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">로봇 3원칙</font>, -三原則, Three Laws of Robotics\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 로봇은 인간에게 해를 끼치지 않아야 하고 인간의 명령에 복종해야 하면서 로봇 자신의 존재를 보호하는 로봇 안전 준칙.\r\n" + 
				"1942년 아이작\r\n" + 
				"\r\n" + 
				"아시모프(Isaac Asimov)의 공상 과학 소설 &#039;런어라운드(Runaround)&#039;에서 처음 언급되었으며, 로봇이 따라야 할 세 가지 원칙은 다음과 같다. \r\n" + 
				"첫째, 로봇은 인간에게 해를 가하거나, 혹은 행동을 하지 않음\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('137420-6')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">대화형 상거래</font>, 對話型商去來, Conversational Commerce\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 메신저로 대화하며 쇼핑을 하는 전자상거래. 일상에서 의사소통 수단으로 PC나 스마트폰에서 메신저가 많이 이용된다. 이 점에 착안하여 전자상거래에 메신저가 활용되게 되었다. 메신저는 로봇이 실시간 대응해주는 챗봇(chatbot)이다. 챗봇은 인공지능(AI) 기술이 반영된 소프트웨어 로봇으로 사람의 자연어를 이해하고, 자연어로 대답을 하기도 한다. \r\n" + 
				"대화형 \r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('137421-6')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">데이터 이동 권리</font>, -異動權利, the right to data portability\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 사용자가 이용 중인 서비스에서 자신의 개인 데이터를 다른 곳으로 이동할 권리. \r\n" + 
				"데이터 이동 권리는 특정인에 의한 사용자 개인정보의 독점 사용 또는 사용자의 동의 없는 무단 사용 등으로부터 정보 주체를 보호하기 위함이다. \r\n" + 
				"사용자는 현재 이용하는 서비스에서 자신의 메일 정보, 사진 등의 개인 데이터를 다른 서비스로 복사, 이동, 전달을 쉽게 할 수 있어야\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('137422-4')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						 	<font color=\"#FF661F\">개인정보보호 규정</font>, 個人情報保護規程, General Data Protection Regulation, GDPR\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 유럽 의회에서 유럽 시민들의 개인정보 보호를 강화하기 위해 만든 통합 규정.\r\n" + 
				"2016년 유럽\r\n" + 
				"\r\n" + 
				"의회에서 공표되었으며(Regulation(EU) 2016/679), 약 2년 간의 유예 기간을 갖은 후 2018년 5월 25일부터 EU 각 회원국에서\r\n" + 
				"\r\n" + 
				"시행된다. 유럽 연합(EU)의 시민의 데이터를 활용하는 경우 GDPR을 준수해야 한다. \r\n" + 
				"GDPR의 주요 항목은,\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('137424-3')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">사용자 체감 전송 속도</font>, 使用者體感電送速度, user experienced data rate\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 이동 통신망에서 사용자가 언제 어디서든 서비스 받을 수 있는 최소한의 데이터 전송 속도. \r\n" + 
				"ITU-R의 IMT-2020(5G) 성능 요구 사항 중 하나이며, 개별 사용자가  체감하는  전송\r\n" + 
				"\r\n" + 
				"속도(user experienced data rate)이다.\r\n" + 
				"						  \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('137425-5')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						 	<font color=\"#FF661F\">최고 전송 속도</font>, 最高電送速度, Peak Data Rate, PDR\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 이동 통신 단말기가 데이터를 전송할 수 있는 최고 속도. 3G(WCDMA) 망에서 최고 전송 속도는 14.4Mbps, 4G(LTE-Advanced) 망에서는 최대 1Gbps이다. \r\n" + 
				"ITU-R의 IMT-2020(5G) 성능 요구 사항 중 하나로 포함되었고, 최고\r\n" + 
				"\r\n" + 
				"전송 속도(Peak Data Rate)는 하향 20Gbps, 상향 10 Gbps 수준으로 제시된\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('137426-8')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">촉각 인터넷</font>, 觸覺-, Tactile Internet\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>\r\n" + 
				"\r\n" + 
				"<dd>\r\n" + 
				"					 \r\n" + 
				"						 사람의 촉각(촉감)이 느낄 만큼 정보를 매우 빠른 속도로 전송하는 인터넷 서비스.\r\n" + 
				"사람의 오감 중 근육이 자극에 반응하는 시간은 약 1초, 귀가 느끼는 시간은 100ms, 눈이 반응하는 시간은 10ms, 그리고 촉각이 반응하는 시간은 1ms 정도이다. \r\n" + 
				"ITU에서는 촉각 인터넷을 1ms의 초저지연(ultra-low latency)과 함께 인터넷의 이용 가\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('137428-5')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">스마트폰 좀비</font>, smartphone zombie\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 스마트폰 화면을 들여다보느라 길거리에서 고개를 숙이고 걷는 사람을 넋 빠진 시체 걸음걸이에 빗대어 일컫는 말. 스마트폰(smartphone)’과 ‘좀비(zombie)’를 합성하여 ‘스몸비(smombie)’라고도\r\n" + 
				"\r\n" + 
				"한다. 스마트폰 좀비(또는 스몸비)는 2015년 독일에서 처음 사용되었으며, 스마트폰에 지나치게 매인 세태를 풍자했다. \r\n" + 
				"특히 스마트폰 화면에 눈\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('137429-5')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">에이비 테스팅</font>, A/B testing\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 디지털 마케팅에서 두 가지 이상의 시안 중 최적안을 선정하기 위해 시험하는 방법.&gt;일반적으로 웹페이지나 앱 개선 시 사용자 인터페이스(UI/UX)를 최적화하기 위해, 실사용자들을 두 집단으로 나누어 기존의 웹페이지 디자인 A안과 새로 개선된 B안을 각각 랜덤으로 보여준 후, A와 B중 선호도가 높게 나온 쪽으로 결정한다. \r\n" + 
				"A/B 테스팅은 단순히 선호도 \r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('137430-4')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						 	<font color=\"#FF661F\">실감형 가상 현실</font>, 實感型假想現實, Immersive Virtual Reality, Immersive VR\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>\r\n" + 
				"\r\n" + 
				"<dd>\r\n" + 
				"					 \r\n" + 
				"						 가상 현실(VR: Virtual Reality)에서 사용자의 몰입감을 증대시켜 주변 환경이 현실이라고 느낄 정도로 실감을 주는 것.\r\n" + 
				"사용자는 시각, 청각, 촉각 등의 감각 요소를 통해 생생한 현실감을 느끼게 된다. \r\n" + 
				"예로, 머리 착용 디스플레이(HMD: Head Mounted Display)를 이용하여 자동차 운전 시뮬레이션을 할 때 실감나는 주행 소음\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('137431-8')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">루트</font>, Real-time Object delivery over Unidirectional Transport, ROUTE\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 방송망을 통해 UHD 방송 콘텐츠를 전송하기 위한 프로토콜. ROUTE는 엠펙\r\n" + 
				"\r\n" + 
				"미디어 전송(MMT: MPEG Media Transport) 프로토콜과 함께 미국 지상파 UHD 방송 표준인 ATSC 3.0의 핵심 전송 프로토콜 기술로 채택되었다. \r\n" + 
				"ROUTE 프로토콜은 IP 기반의 파일 또는 분할된 객체들을 실시간으로 전송할 수 있게 기존의 비실시간 파일 \r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('137432-5')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">소셜 로봇</font>, Social Robot\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 언어, 몸짓 등 사회적 행동으로 사람과 교감하고 상호 작용하는 자율 로봇.산업용 로봇이나 서비스 로봇과 같이 사람을 위해 물리적인 일을 하는 대신 사람처럼 대화를 하고 감성적인 몸짓으로 사람과 정서적으로 소통한다. 인공지능(AI), 빅데이터, 사물인터넷(IoT),\r\n" + 
				"\r\n" + 
				"클라우드 컴퓨팅(Cloud Computing) 등 기술이 융합되어 사람의 말을 이해하고 카메라\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('137433-6')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						 	<font color=\"#FF661F\">전자 서비스 안내</font>, 電子-案內, Electronic Service Guide, ESG\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 초고선명(UHD) 방송에서 방송 프로그램 정보를 안내하는 부가 서비스.\r\n" + 
				"기존\r\n" + 
				"\r\n" + 
				"디지털 텔레비전(DTV)의 전자\r\n" + 
				"\r\n" + 
				"프로그램 안내(EPG: Electronic Program Guide)는 텍스트 기반의 간단한 방송 프로그램 정보만을 제공하지만, ESG는 텍스트 정보 외에 이미지, 동영상, 애플리케이션 등 다양한 서비스를 제공한다. \r\n" + 
				"UHD 방송이 방송망과 인터\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('137435-3')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						 	<font color=\"#FF661F\">모바일 기기 기본 보호프로파일</font>, -器機基本保護-, Mobile Device Fundamentals Protection Profile, MDFPP\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>\r\n" + 
				"\r\n" + 
				"<dd>\r\n" + 
				"					 \r\n" + 
				"						 국제 공통평가기준(CC: Common Criteria)을 준용하여 모바일 기기에 대한 보안 인증 요구 사항을 기술한 국제 표준. \r\n" + 
				"스마트폰, 태블릿PC 등 모바일 기기 보안의 핵심이 되는 키\r\n" + 
				"\r\n" + 
				"관리(key management), 암호 모듈, 기기 암호화, 와이파이(Wi-Fi) 보안,\r\n" + 
				"\r\n" + 
				"화면 잠금(screen lock) 및 단말 관리 등에 대해 80여 개의 보\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('137436-8')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">지능정보기술</font>, 知能情報技術\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 인간의 인지, 학습, 추론 등 고차원적 정보 처리 활동을 ICT 기반으로 구현하는 기술. \r\n" + 
				"인공 지능(AI)에 데이터 활용 기술인\r\n" + 
				"\r\n" + 
				"사물 인터넷(IoT),\r\n" + 
				"\r\n" + 
				"빅데이터(Big data), 클라우드(Cloud), 모바일(Mobile)이 결합되어 AI+IBCM으로 표현된다.\r\n" + 
				"사물 인터넷과 모바일로 각종 정보를 수집하고 실시간으로 전달하며, 빅데이터와 클라우드를 \r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('137437-5')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">트러스트존 기술</font>, -技術, TrustZone technology\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 프로세서(processor) 안에 독립적인 보안 구역을 따로 두어 중요한 정보를 보호하는 하드웨어 기반의 보안 기술. \r\n" + 
				"암(ARM: Advanced RISC Machine)사에서 개발하였다(ARM® TrustZone®). 트러스트존(TrustZone) 기술은 하드웨어에서 직접 실행되며 하나의 CPU를 2개의 가상 공간, 즉 일반\r\n" + 
				"\r\n" + 
				"구역(normal worl\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('137438-5')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						 	<font color=\"#FF661F\">무선 프로그래밍 갱신</font>, 無線-更新, Over-The-Air programming, OTA\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 무선통신망에서 필요한 데이터를 무선 채널을 통해 해당 기기로 전송하여, 기기의 환경 설정, 소프트웨어 등을 갱신하는 방법.\r\n" + 
				"OTA는 원격의 한 송신기에서 해당되는 기기 전부에 데이터를 전송하면, 각 기기에서 수신된 데이터를 사용하여 필요한 과정을 수행한다. \r\n" + 
				"휴대폰, 셋톱박스, 와이파이(Wi-Fi) 기기, 기지국, 자동차 등 사용자 기기를 개별적으로 관리\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('137439-5')\">\r\n" + 
				"                <b>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<font color=\"#FF661F\">독싱</font>, doxing\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 해킹한 정보를 온라인에 공개하는 행위. \r\n" + 
				"독싱(doxing)은 ‘dropping docs‘(문서를 떨어뜨리다)에서 파생된 신조어로 특정인의 이름, 주소, 전화번호, 사진 등 사적인 정보를 뒷조사하여 다른 사람에게 누설하는 것을 내포한다. \r\n" + 
				"특정 개인이나 조직이 주로 공격 대상이 되며, 이메일, 블로그, 온라인 게임, 누리소통망(SNS) 등에서 개인정보를 \r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"             	\r\n" + 
				"			<dl>\r\n" + 
				"                <dt><a href=\"javascript:fn_dictionaryView('062493-8')\">\r\n" + 
				"                <b>\r\n" + 
				"					\r\n" + 
				"						\r\n" + 
				"						 	<font color=\"#FF661F\">대규모 다중 접속 온라인 역할 게임</font>, 大規模多衆接續-役割-, Massively Multiplayer Online Role-Playing Game, MMORPG\r\n" + 
				"						\r\n" + 
				"						\r\n" + 
				"					                \r\n" + 
				"                </b></a></dt>					\r\n" + 
				"				<dd>\r\n" + 
				"					 \r\n" + 
				"						 수백 또는 수천 명 이상이 동시에 같은 게임에 접속하여 각자 맡은 등장인물의 역할을 수행하고 서로 협업하며 즐기는 온라인 게임. MMORPG는 대규모\r\n" + 
				"\r\n" + 
				"다중 이용자(MMO)와 역할 게임(RPG)의 합성어로, RPG와의 차이점은 수백, 수천 또는 수만 명의 이용자들이 동시에 게임에 접속할 수 있는 대규모 온라인 RPG를 뜻한다. \r\n" + 
				"한 게임 안에서 수백, 수천\r\n" + 
				"						 ... \r\n" + 
				"					 \r\n" + 
				"				</dd>\r\n" + 
				"				\r\n" + 
				"             	</dl>\r\n" + 
				"";
//		System.out.println(s);
		s.trim();
		String[] sarr = new String[102];
//		System.out.println(s);
		// <dd>랑 </dd>를 찾아서

		
		for (int i = 0; i < 102; i++) {
//			System.out.println("start");
			int inb = s.indexOf("<dd>");
			int ine = s.indexOf("</dd>");
			
			if(inb == -1 && ine == -1) break;
			
//			System.out.println(inb);
//			System.out.println(ine);
			
//			if(i == 1)
//			System.out.println(s);
			
			String n = s.substring(inb+4, ine);
			

//			System.out.println(s.length());
			
			s = s.substring(ine+5, s.length());
			
			sarr[i] = n;
			System.out.println(sarr[i]);
//			System.out.println("end");
		}
//
//		int cnt = 0;
//		char[] nch = new char[100000];
//		for (int i = 0; i < sarr.length-2; i++) {
//			String h = sarr[i];
//			for (int j = 0; j < h.length(); j++) {
//				if(h.charAt(i) == '\t')
//					continue;
//				else if(h.charAt(i) == ' ')
//					continue;
//				else if(h.charAt(i) != '\n')
//					nch[cnt++] = h.charAt(j);
//				else
//					nch[cnt++] = ' ';
//			}
//			
//		}
		
		
		
//		System.out.println(nch);
		
		
		//</dd> 까지의 인덱스를 또 짜린드


	}
}


