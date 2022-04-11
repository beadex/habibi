package phong.tran1.habibi.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseObject<T> {
    private boolean success;
    private String message;
    private T data;

    public ResponseObject(boolean success, String message) {
        this.success = success;
        this.message = message;
    }
}
