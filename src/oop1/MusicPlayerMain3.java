package oop1;

/*
 * 메서드 추출
 */
public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData musicPlayerData = new MusicPlayerData();

        // 음악 플레이어 켜기
        on(musicPlayerData);

        // 볼륨 증가
        volumeUp(musicPlayerData);
        volumeUp(musicPlayerData);

        // 볼륨 감소
        volumeDown(musicPlayerData);

        // 음악 플레이어 상태
        showStatus(musicPlayerData);

        // 음악 플레이어 끄기
        off(musicPlayerData);

    }

    static void on(MusicPlayerData musicPlayerData) {
        musicPlayerData.isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }

    static void off(MusicPlayerData musicPlayerData) {
        musicPlayerData.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumeUp(MusicPlayerData musicPlayerData) {
        musicPlayerData.volume++;
        System.out.println("음악 플레이어 볼륨: " + musicPlayerData.volume);
    }

    static void volumeDown(MusicPlayerData musicPlayerData) {
        musicPlayerData.volume--;
        System.out.println("음악 플레이어 볼륨: " + musicPlayerData.volume);
    }

    static void showStatus(MusicPlayerData musicPlayerData) {
        System.out.println("음악 플레이어 상태 확인" );
        if (musicPlayerData.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + musicPlayerData.volume);
        } else  {
            System.out.println("음악 플레이어 OFF, 볼륨: " + musicPlayerData.volume);
        }
    }
}
