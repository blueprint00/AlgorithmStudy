package Hash;
import java.util.*;

class BestAlbum {
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
        HashMap<String, Integer> albumMap = new HashMap<>(); // 앨범, 재생횟수
        
        for(int i = 0; i < genres.length; i ++) {
        	int id = i;
        	int play = plays[i];
        	String genre = genres[i];
        	
        	songList.add(new Song(id, play, genre));
        	
        	if(genreMap.containsKey(genre)) {
        		genreMap.put(genre, genreMap.get(genre) + play);
        	} else {
        		genreMap.put(genre, play);
        	}
        }
        
        Collections.sort(songList, new Comparator<Song>(){

			@Override
			public int compare(Song s1, Song s2) {
				if(s1.genre.equals(s2.genre)) {
					return s1.compareTo(s2);
				} else {
					return - (genreMap.get(s1.genre) - genreMap.get(s2.genre)); // 재생 횟수 많은 순으로(내림차순 5,4,3,2,1)
				}
			}
        	
        });
        
        for(Song song : songList) {
        	if(!albumMap.containsKey(song.genre)) {
        		albumMap.put(song.genre, 1);
        		bestAlbum.add(song.id);
        	} else {
        		int genreCnt = albumMap.get(song.genre);
        		
        		if(genreCnt >= 2) continue;
        		else {
        			albumMap.put(song.genre, genreCnt + 1);
        			bestAlbum.add(song.id);
        		}
        	}
        }
        
        int[] answer = new int[bestAlbum.size()];
        for(int i = 0; i < bestAlbum.size(); i ++) {
        	answer[i] = bestAlbum.get(i);
        }
        
        return answer;
    }
}

class Song implements Comparable<Song> {

	int id, play;
	String genre;
	
	Song(int id, int play, String genre){
		this.id = id;
		this.play = play;
		this.genre = genre;
	}
	
	//?????????????????
	@Override
	public int compareTo(Song o) {
		if(this.play == o.play){ // 재생횟수 같으면
            return this.id - o.id; // 고유 번호가 더 낮은 순으로
        } else { 
            return -(this.play - o.play); // 재생 횟수 많은 순으로(내림차순)
        }
		
	}
}
