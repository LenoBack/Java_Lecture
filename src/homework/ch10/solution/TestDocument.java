package homework.ch10.solution;

public class TestDocument {
    public static void main(String args[]){
        Contents contents = new Contents(
                "“미세먼지에 나들이 취소” 뿌연 하늘에 갇힌 한반도",
                "“모처럼 친구들과 서울시청 앞 서울광장 스케이트장에 가려고 했는데 미세먼지 때문에 문을 닫아 아쉬워요.”\n" +
                        "\n" +
                        "직장인 노모 씨(33)는 7일 새해 첫 주말을 맞아 친구들과 만나기로 했던 약속을 취소했다. 노 씨는 “사회적 거리 두기 해제로 올해는 야외활동을 많이 하려고 했는데 미세먼지 때문에 제약이 생겼다”며 답답해했다.\n" +
                        "\n" +
                        "7, 8일 고농도 미세먼지가 한반도를 덮치면서 상당수 시민이 야외로 가려던 발길을 돌려 실내로 향했다. 서울 성북구에 사는 대학생 홍예표 씨(24)는 “여자친구와 종로구 북악스카이웨이로 드라이브를 가려 했는데 미세먼지로 대기가 악화돼 대신 동네 카페에서 실내 데이트를 했다”고 말했다.\n" +
                        "\n" +
                        "맘카페 등 인터넷 커뮤니티에도 “아이와 눈썰매장에 가기로 했는데 미세먼지 때문에 취소했다”는 등의 글이 연이어 올라왔다. 야외 나들이를 포기한 이들 덕분에 영화관과 박물관, 미술관, 대형 쇼핑몰 등 실내 공간에는 인파가 북적이는 모습이었다.\n" +
                        "\n" +
                        "길거리에 다니는 시민들은 대부분 마스크를 썼다. 사회적 거리 두기 해제 후 길거리에서 마스크를 벗고 다니는 이들이 적지 않았지만 미세먼지 때문에 다시 마스크 착용이 늘어난 것이다. 숨쉬기 편한 비말차단용 또는 덴털 마스크 대신 보건용(KF94) 마스크를 다시 쓴 이도 많았다. 직장인 박재성 씨(52)는 “신종 코로나바이러스 감염증(코로나19) 확산이 한풀 꺾이면서 일회용 덴털 마스크를 이용했는데 미세먼지 때문에 목이 칼칼해 주말부터 KF94 마스크를 다시 쓰기 시작했다”고 말했다.\n" +
                        "\n" +
                        "고농도 미세먼지의 여파에도 진보·보수단체는 서울역과 서울시청역 일대에서 1000명 이상 참여하는 도심 집회를 열었다. 촛불승리전환행동(촛불행동)은 7일 오후 4시부터 시청역 인근에서 약 1500명(경찰 추산)이 모여 집회를 연 후 용산구 삼각지역 방향으로 행진했다. 우리공화당은 이날 낮 12시부터 약 1000명(경찰 추산)이 모여 서울역 광장에서 ‘태극기 집회’를 진행한 뒤 삼각지역 방향으로 행진했다. 집회 때문에 도심 일대가 통제되면서 시민들은 불편을 겪었다. 부산에서 KTX를 타고 올라온 이동순 씨(49)는 “가족과 함께 왔는데 집회 때문에 서울서 만나기로 한 친척도 못 찾고 일대를 한참 헤맸다”고 말했다.\n" +
                        "\n" +
                        "국립환경과학원 대기질통합예보센터에 따르면 8일 수도권과 호남 서부 지역에는 중국 북부와 고비 사막에서 발원한 황사가 북서풍을 타고 유입되면서 오후 한때 미세먼지가 ‘매우 나쁨’ 수준까지 악화됐다. 환경부는 전국 대부분 지역에 미세먼지 주의보를 발령했고 서울시는 주말 내내 서울광장 스케이트장 등 공공 야외 체육시설 운영을 중단했다.\n" +
                        "\n" +
                        "센터는 9일에도 수도권과 강원 영서, 충청, 호남, 대구·경북 등에서 미세먼지가 ‘나쁨’(m³당 81∼150μg) 수준을 보일 것으로 예보했다. 또 한반도 상공의 대기가 정체되고 중국발 황사까지 유입되면서 12일까지 미세먼지 농도가 높을 것으로 전망했다.\n",
                "뉴스의 끝 입니다");

        // 텍스트 문서 출력
        DocumentFactory.getDocumentBuild(
                Document.TEXT_DOCUMENT)
                .printDoc(contents);

        // HTML 문서 출력
        DocumentFactory.getDocumentBuild(
                Document.HTML_DOCUMENT)
                .printDoc(contents);

    }
}
