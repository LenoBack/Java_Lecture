package ch02;

/**
 * 데이터 오버풀로우
 * 해당 자료형의 범위가 넘어갔을시 자료 손실이 발생하는 것을 의미함
 * 정수형 자료형을 작은 범위에서 -> 반대쪽 끝에서 다시 시작하는 서큘러(circular) 구조를 보인다.
 */
public class ByteOverflow {
    public static void main(String args[]) {
        byte b = 0; // byte형 변수b를 선언하고 0을 초기화
        int  i = 0;
        // 정수 리터럴값을 byte로 형변환
        // 낮은 자료형으로 형변환시에는 값의 범위를 넘어서는지 확인해야 함
        byte ofb = (byte)128; // -128
        // int -> byte가 호환되지 않는 유형으로 변환할 수 없음
        // byte nb = 128; // 컴파일 오류 발생 : incompatible types: possible lossy conversion from int to byte

        // 반복문을 이용해서 byte 타입 변수 b값을 0~270까지 증가시킨다
        // byte의 값의 범위인 -128 ~ 127을 넘어서면 overflow가 발생한다
        for(int j=0; j<=270; j++) {
            System.out.print(b++);
            System.out.print('\t');
            System.out.println(i++);
        }

        System.out.println("byte overflow (대입값 : 128) :" + ofb);
    }
}
