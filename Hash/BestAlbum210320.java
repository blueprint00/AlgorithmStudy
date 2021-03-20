package Hash;
import java.util.*;
public class BestAlbum210320 {
    public static void main(String[] args) {
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};
		int[] answer = {};		
		
		answer = solution(genres, plays);
		for(int ans : answer) {
			System.out.println(ans);
		}
	}
	
	public static int[] solution(String[] genres, int[] plays) {
        ArrayList<Integer> bestAlbum = new ArrayList<>();
        ArrayList<Song> songList = new ArrayList<>();
        HashMap<String, Integer> genreMap = new HashMap<>(); // 장르, 재생횟수
        HashMap<String, Integer> albumMap = new HashMap<>(); // 앨범장르, 장르가 실린 횟수

        for(int i = 0; i < genres.length; i ++){
            int id = i;
            int play = plays[i];
            String genre = genres[i];

            songList.add(new Song(id, play, genre));

            genreMap.put(genre, genreMap.getOrDefault(genre, 0) + play);
        }

        Collections.sort(songList, new Comparator<Song>(){
            @Override
            public int compare(Song s1, Song s2){
                if(s1.genre.equals(s2.genre)){
                    return s1.compareTo(s2);
                } else { // 장르가 다르면 
                    return genreMap.get(s2.genre) - genreMap.get(s1.genre); // 재생 횟수 많은 순으로 내림차순
                    //양수 => 큰게 앞으로 == 내림차순
                }
            }
        });

        for(Song song : songList){
            if(!albumMap.containsKey(song.genre)) { //앨범에 해당된 장르가 없으면
                albumMap.put(song.genre, 1);
                bestAlbum.add(song.id);
            } else {
                int genreCnt  = albumMap.get(song.genre); // 해당 장르가 추가 된 횟수
                if(genreCnt >= 2) continue; // 두 개 까지만 싣기로 했으므로 2개 넘어가면 빠빠이
                
                albumMap.put(song.genre, genreCnt + 1);
                bestAlbum.add(song.id);
           }
        }

        int[] answer = new int[bestAlbum.size()];
        for(int i = 0; i < bestAlbum.size(); i ++){
            answer[i] = bestAlbum.get(i);
        }
        return answer;
    }
}
class Song implements Comparable<Song> {
    int id;
    int play;
    String genre;

    public Song(int id, int play, String genre){
        this.id = id;
        this.play = play;
        this.genre = genre;
    }

    @Override
    public int compareTo(Song o){
        if(this.play == o.play){ // 재생 횟수가 같으면
            return this.id - o.id; // 고유 번호 낮은 번호 먼저
        } else { //
            return - (this.play - o.play); // 재생횟수 많은 순으로 내림차순
        }
    }
}