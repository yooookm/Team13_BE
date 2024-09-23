package dbdr.domain.chart;

import dbdr.domain.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;

@Entity
@SQLDelete(sql = "UPDATE cognitive_management SET is_active = false WHERE id = ?")
@SQLRestriction("is_active = true")
public class CognitiveManagement extends BaseEntity {
    @Comment("의사소통 도움 여부")
    private boolean cognitiveHelp; // 의사소통 도움 여부

    @Comment("인지 관리 특이사항")
    @Column(length = 1000)
    private String cognitiveNote; // 인지 관리 특이사항
}